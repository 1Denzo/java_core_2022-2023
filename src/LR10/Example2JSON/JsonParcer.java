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

