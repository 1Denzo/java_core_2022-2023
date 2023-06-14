package LR10.Example2JSON;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;


public class JsonParcer {

    private static final String TAG_VENDOR = "vendor";
    private static final String TAG_ID = "id";
    private static final String TAG_MODEL = "model";
    private static final String TAG_AGE = "age";
    private static final String TAG_MOTO = "Motobikes";

    public MotobikesList1 parsJson() throws ParseException, IOException {
        ArrayList<Motobike1> motobike1ArrayList = new ArrayList<>();
        FileWorker fileWorker = new FileWorker();
        Object obj = fileWorker.fileReader();
        JSONObject jsonObject = (JSONObject) obj;
        String mainName;
        mainName = jsonObject.keySet().iterator().next().toString();
        JSONArray jsonArray = (JSONArray) jsonObject.get(TAG_MOTO);
            for (Object o : jsonArray) {
                JSONObject bike1 = (JSONObject) o;
                Motobike1 motobike1 = new Motobike1(bike1.get(TAG_ID).toString(), bike1.get(TAG_VENDOR).toString(),
                        bike1.get(TAG_MODEL).toString(), bike1.get(TAG_AGE).toString());
                motobike1ArrayList.add(motobike1);
            }
        return new MotobikesList1(mainName, motobike1ArrayList);
    }
}
    /*public static void main(String[] args) throws ParseException {
        //public MotobikesList JsonPars(Object obj) {
        FileWorker fileWorker = new FileWorker();
        Object obj;
        try {
            obj = fileWorker.fileReader();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        JSONObject jsonObject = (JSONObject) obj;
        JSONArray jsonArray = (JSONArray) jsonObject.get("Motobikes");
        for (Object o : jsonArray) {
            JSONObject bike1 = (JSONObject) o;
            System.out.println("\nТекущий элемент: " + TAG_MOTO);
            System.out.println(TAG_ID + ": " + bike1.get(TAG_ID));
            System.out.println(TAG_VENDOR + ": " + bike1.get(TAG_VENDOR));
            System.out.println(TAG_MODEL + ": " + bike1.get(TAG_MODEL));
            System.out.println(TAG_AGE + ": " + bike1.get(TAG_AGE));

            //return null;
        }
    }*/

/*
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
*/
