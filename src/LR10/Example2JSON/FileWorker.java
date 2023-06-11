package LR10.Example2JSON;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileWorker {
    private static final String TAG_PATHFILE =
            "C:\\Users\\denzo\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example2JSON\\moto1.json";
    static final String TAG_PATHFOLDER =
            "C:\\Users\\denzo\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example2JSON\\";

    public Object fileReader() throws ParseException {
            JSONParser parser = new JSONParser();
        Object obj;
        try {
            obj = parser.parse(new FileReader(TAG_PATHFILE));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }


    /*public void JsonCreater(MotobikesList motobikesList) {
        ArrayList<Motobike> motobikeArrayList = motobikesList.getMotobikesList();
        String mainName = motobikesList.getMainName();
        JSONObject bikeArray = new JSONObject();
        JSONArray motobikes = new JSONArray();
        motobikes.addAll(motobikeArrayList);
        bikeArray.put(mainName, motobikes);
        try (FileWriter file = new FileWriter(TAG_PATHFOLDER + "moto1.json")){
            file.write( bikeArray.toJSONString());
            System.out.println("Json файл успешно создан!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }*/
}
