package coursework1;

import LR10.Example2JSON.Motobike1;
import LR10.Example2JSON.MotobikesList1;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWorker {

    public static final String TAG_PATHFILE =
            "C:\\Users\\reus\\IdeaProjects\\java_core_2022-2023\\src\\coursework1\\MotobikeList.xml";
    public static final String TAG_PATHFOLDER =
            "C:\\Users\\reus\\IdeaProjects\\java_core_2022-2023\\src\\coursework1\\";

    public static ArrayList<String> FolderScaner(String fileExtension) {
        System.out.println("");
        File folder = new File(TAG_PATHFOLDER);
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> filesName = new ArrayList<>();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i] != null) {
                if (listOfFiles[i].isFile()) {
                    if (listOfFiles[i].getName().endsWith(fileExtension)) {
                        filesName.add(listOfFiles[i].getName());
                    }
                }
            }
        }
        return filesName;
    }

    protected Document buildDocument() {
        File file = new File(TAG_PATHFILE);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        try {
            doc = dbf.newDocumentBuilder().parse(file);
        } catch (Exception e) {
            System.out.println("Ошибка открытия парсинга!!!" + e.toString());
        }
        return doc;
    }

    protected String mainName(Document doc1) {
        doc1 = buildDocument();
        String mainName = doc1.getFirstChild().getNodeName();
        //System.out.println("FirtsChild " + mainName.toString());
        return mainName;
    }

    protected String nodeName(Document doc1) {
        doc1 = buildDocument();
        String nodeName = doc1.getFirstChild().getChildNodes().item(0).getNodeName();
        //System.out.println("FirtsChild " + mainName.toString());
        return nodeName;
    }

    public void fileWriter(Document doc2) {
        try {
            //Запись XML-файла из объекта doc2
            doc2.setXmlStandalone(true);
            doc2.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc2);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File(TAG_PATHFILE));
            transformer.transform(source, result);
            System.out.println("Файл XML успешно записан!");
        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }

    public void txtFileWriter(MotobikesList motobikesList) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.print("Введите имя файла => ");
        String fname = sc.nextLine();
        try {
            File fw = new File(TAG_PATHFOLDER + fname + ".txt");
            fw.createNewFile(); // файл создан
            System.out.println("Путь к файлу: " + fw.getAbsolutePath());
            BufferedWriter dOut = new BufferedWriter(new FileWriter(fw));
            dOut.write(motobikesList.toString());
            dOut.flush();
            dOut.close();
            System.out.println("Файл записан.");
        } catch (IOException e) {
            System.out.println("" + e);
        }
    }

    public Object fileReader() throws ParseException {
        JSONParser parser = new JSONParser();
        Object obj;
        try {
            obj = parser.parse(new FileReader(TAG_PATHFOLDER + "moto1.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }


    public void JsonMod(MotobikesList1 motobikesList1) {
        ArrayList<Motobike1> motobikeArrayList = motobikesList1.getMotobikesList();
        String mainName = motobikesList1.getMainName();
        JSONObject bikeArray = new JSONObject();
        JSONArray motobikes = new JSONArray();
        motobikes.addAll(motobikeArrayList);
        bikeArray.put(mainName, motobikes);
        try (FileWriter file = new FileWriter(TAG_PATHFOLDER + "moto1.json")) {
            file.write(bikeArray.toJSONString());
            file.flush();
            file.close();
            System.out.println("Json файл изменен!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void txtFileWriter(MotobikesList1 motobikesList1) {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Введите имя файла => ");
        String fname = sc.nextLine();
        try {
            File fw = new File(TAG_PATHFOLDER + fname + ".txt");
            fw.createNewFile(); // файл создан
            System.out.println("Путь к файлу: " + fw.getAbsolutePath());
            BufferedWriter dOut = new BufferedWriter(new FileWriter(fw));
            dOut.write(motobikesList1.toString());
            dOut.flush();
            dOut.close();
            System.out.println("Файл записан.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

