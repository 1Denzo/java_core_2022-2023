package LR10.Example2JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWorker {
    static final String TAG_PATHFOLDER =
            "C:\\Users\\denzo\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example2JSON\\";

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
        try (FileWriter file = new FileWriter(TAG_PATHFOLDER + "moto1.json")){
            file.write( bikeArray.toJSONString());
            file.flush();
            file.close();
            System.out.println("Json файл изменен!");
        } catch (Exception e){
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
