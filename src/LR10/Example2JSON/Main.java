package LR10.Example2JSON;

import org.json.simple.parser.ParseException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {

    //Используем оператор цикла do-while для бесконечного цикла выбора пункта меню
    public static void main(String[] args)
            throws IOException, ParserConfigurationException, TransformerException, ParseException {
        String choice;
        //Классы наиболее часто используемые в теле меню вынесены в заглавие
        JsonParcer parcer = new JsonParcer();
        FileWorker fileWorker = new FileWorker();
        //Тело меню
        do {
            mainMenu menu = new mainMenu();
            choice = menu.Menu();
            System.out.println("\n");
            switch (choice) {
                case "1":
                    menu.One();
                    break;
                case "2":
                    String twomenu = menu.Two1();
                    short[] param;
                    searchNode searchClass = new searchNode();
                    String searchString;
                    switch (twomenu) {
                        case "id": //Поиск по полю id
                            param = menu.Two2();
                            MotobikesList1 searchlist = searchClass.findLoopNum(twomenu, param);
                            System.out.println("Найдено: " + searchlist.toString());
                            break;
                        case "Vendor": // Поиск по полю Vendor
                            searchString = searchClass.searchString(twomenu);
                            MotobikesList1 searchMoto = searchClass.findLoopString(twomenu, searchString);
                            System.out.println("Результат поиска :" + searchMoto.toString());
                            break;
                        case "Model": // Поиск по полю Model
                            searchString = searchClass.searchString(twomenu);
                            MotobikesList1 searchMoto1 = searchClass.findLoopString(twomenu, searchString);
                            System.out.println("Результат поиска :" + searchMoto1.toString());
                            break;
                        case "Age": // Поиск по полю Age
                            param = menu.Two2();
                            MotobikesList1 searchlist2 = searchClass.findLoopNum(twomenu, param);
                            System.out.println("Найдено: " + searchlist2.toString());
                            break;
                    }
                   break;
                case "3":
                    ReWriteNode reWriteNode = null;
                    System.out.println("Измененение узла в файле XML: ");
                    MotobikesList1 motobikesList1 = parcer.parsJson();
                   int idReWriteNode = menu.Three(motobikesList1);
                    MotobikesList1 motobikesList12 = reWriteNode.reWriteNode(idReWriteNode);

                    System.out.println(idReWriteNode);
                    break;
                case "4":
                    System.out.println("Добавление узла в файл JSON: ");
                    AddNode addNode = new AddNode();
                    MotobikesList1 motobikesList13 = addNode.addnode();
                    fileWorker.JsonMod(motobikesList13);
                    break;
                case "5":
                   System.out.println("Удаление узлa в файле JSON по номеру id");
                   MotobikesList1 motobikesList14 = parcer.parsJson();
                   DelNode delNode = new DelNode();
                   MotobikesList1 motobikesList15 = delNode.delNode(motobikesList14);
                   fileWorker.JsonMod(motobikesList15);
                    break;
            }
        } while (!choice.isEmpty());
    }
}
