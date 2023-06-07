package LR10.Example2JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;

public class JsonCreator {
    public static void main(String[] args) {
        JSONObject bikeArray = new JSONObject();
        JSONArray motobikes = new JSONArray();
        JSONObject bike1 = new JSONObject();
        bike1.put("Vendor", "Kawasaki");
        bike1.put("Model", "KLE250");
        bike1.put("Age", 20);

        JSONObject bike2 = new JSONObject();
        bike2.put("Vendor", "Honda");
        bike2.put("Model", "TransAlp");
        bike2.put("Age", 15);

        motobikes.add(bike1);
        motobikes.add(bike2);

        bikeArray.put("Motobikes", motobikes);

        try (FileWriter file = new FileWriter("src/LR10/Example2JSON/moto.json")){
          file.write( bikeArray.toJSONString());
          System.out.println("Json файл успешно создан!");
        } catch (Exception e){
          e.printStackTrace();
    }
}
}
