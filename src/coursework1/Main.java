package coursework1;

import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {

    //Используем оператор цикла do-while для бесконечного цикла выбора пункта меню
    public static void main(String args[])
            throws IOException, ParserConfigurationException, TransformerException {
        String choice;
        //Классы наиболее часто используемые в теле меню вынесены в заглавие
        Parcer parcer = new Parcer();
        FileWorker fileWorker = new FileWorker();
        //Тело меню
        do {
            mainMenu menu = new mainMenu();
            choice = menu.Menu();
            System.out.println("\n");
            switch (choice) {
                case "1":
                    menu.One();
                    //System.out.println(pars.mainName(pars.buildDocument()));
                    break;
                case "2":
                    String twomenu = menu.Two1();
                    short[] param = null;
                    searchNode searchClass = new searchNode();
                    String searchString = null;
                    switch (twomenu) {
                        case "id": //Поиск по полю id
                            param = menu.Two2();
                            MotobikesList searchlist = searchClass.findLoopNum(twomenu, param);
                            System.out.println("Найдено: " + searchlist.toString());
                            break;
                        case "Vendor": // Поиск по полю Vendor
                            searchString = searchClass.searchString(twomenu);
                            MotobikesList searchMoto = searchClass.findLoopString(twomenu, searchString);
                            System.out.println("Результат поиска :" + searchMoto.toString());
                            break;
                        case "Model": // Поиск по полю Model
                            searchString = searchClass.searchString(twomenu);
                            MotobikesList searchMoto1 = searchClass.findLoopString(twomenu, searchString);
                            System.out.println("Результат поиска :" + searchMoto1.toString());
                            break;
                        case "Age": // Поиск по полю Age
                            param = menu.Two2();
                            MotobikesList searchlist2 = searchClass.findLoopNum(twomenu, param);
                            System.out.println("Найдено: " + searchlist2.toString());
                            break;
                    }
                   break;
                case "3":
                    System.out.println("Измененение узла в файл XML: ");
                   // menu.Two();
                    break;
                case "4":
                    System.out.println("Добавление узла в файл XML: ");
                    addNode addNode = new addNode();
                    MotobikesList motobikesList1 = addNode.addnode();
                    Document doc = parcer.docCreator(motobikesList1);
                    fileWorker.fileWriter(doc);
                    break;
                case "5":
                    System.out.println("Удаление узлa в файле XML по номеру id");
                    MotobikesList motobikesList3 = parcer.parsMotoXML();
                    delNode delNode = new delNode();
                    MotobikesList motobikesList4 = delNode.delNode(motobikesList3);
                    Document doc1 = parcer.docCreator(motobikesList4);
                    fileWorker.fileWriter(doc1);
                    break;
                /*case "5":
                    parcer.JsonCreater(parcer.parsMotoXML());*/
            }
        } while (!choice.isEmpty());
    }
}
