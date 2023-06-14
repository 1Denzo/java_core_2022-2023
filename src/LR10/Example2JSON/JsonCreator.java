package LR10.Example2JSON;

import LR10.Example1XML.ParcerXML.Motobike;
import LR10.Example1XML.ParcerXML.MotobikesList;
import LR10.Example1XML.ParcerXML.Parcer;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.util.ArrayList;

public class JsonCreator {
    public static void main(String[] args) {
        Parcer parcer = new Parcer();
        MotobikesList motobikesList = parcer.parsMotoXML();
        ArrayList<Motobike> motobikeArrayList = motobikesList.getMotobikesList();
        String mainName = motobikesList.getMainName();
        JSONObject bikeArray = new JSONObject();
        JSONArray motobikes = new JSONArray();
        motobikes.addAll(motobikeArrayList);
        bikeArray.put(mainName, motobikes);


            try (FileWriter file = new FileWriter("src/LR10/Example2JSON/moto.json")) {
                file.write(bikeArray.toJSONString());
                System.out.println("Json файл успешно создан!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
