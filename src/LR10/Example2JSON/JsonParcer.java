package LR10.Example2JSON;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JsonParcer {
    public static  void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("C:\\Users\\denzo\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example2JSON\\moto.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("Motobikes");
            for (Object o : jsonArray) {
                JSONObject bike1 = (JSONObject) o;
                System.out.println("\nТекущий элемент: bike");
                System.out.println("id: " + bike1.get("id"));
                System.out.println("Vendor: " + bike1.get("Vendor"));
                System.out.println("Model: " + bike1.get("Model"));
                System.out.println("Age: " + bike1.get("Age"));
            }
        }catch ( Exception e) {
            e.printStackTrace();
            }
        }
    }

