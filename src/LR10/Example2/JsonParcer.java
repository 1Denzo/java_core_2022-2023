package LR10.Example2;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JsonParcer {
    public static  void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("C:\\Users\\denzo\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example2\\example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги:" + book.get("title"));
                System.out.println("Автор:" + book.get("author"));
                System.out.println("Год издания:" + book.get("year"));

            }
        }catch ( Exception e) {
            e.printStackTrace();

            }
        }
    }

