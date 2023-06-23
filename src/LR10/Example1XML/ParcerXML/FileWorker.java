package LR10.Example1XML.ParcerXML;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWorker {

    private static final String TAG_PATHFILE =
            "C:\\Users\\reus\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example1XML\\ParcerXML\\MotobikeList.xml";
    static final String TAG_PATHFOLDER =
            "C:\\Users\\reus\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example1XML\\ParcerXML\\";

    protected Document buildDocument() {
        File file = new File(TAG_PATHFILE);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        try {
            doc = dbf.newDocumentBuilder().parse(file);
        } catch (Exception e) {
            System.out.println("Ошибка открытия парсинга!!!" + e);
        }
        return doc;
    }

    protected String mainName() {
        Document doc1 = buildDocument();
        return doc1.getFirstChild().getNodeName();
    }
/*    protected String nodeName(Document doc1) {
        doc1 = buildDocument();
        String nodeName = doc1.getFirstChild().getChildNodes().item(0).getNodeName();
        //System.out.println("FirtsChild " + mainName.toString());
        return nodeName;
    }*/
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
            javax.xml.transform.dom.DOMSource source = new DOMSource(doc2);
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
            System.out.println(String.valueOf(e));
        }
    }
}
