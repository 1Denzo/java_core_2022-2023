package LR10.Example1XML.ParcerXML;


import com.graphbuilder.math.AddNode;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static Runtime runtime;

    //Использовать оператор цикла do-while для выбора пункта меню
    public static void main(String args[])
            throws IOException, ParserConfigurationException, TransformerException {
        String choice;
        do {
            mainMenu menu = new mainMenu();
            choice = menu.Menu();
            System.out.println("\n");
            switch (choice) {
                case "1":
                    Parcer pars = new Parcer();
                    MotobikesList motobikesList = new MotobikesList(pars.mainName(pars.buildDocument()), pars.parsMoto());
                    System.out.println(motobikesList.toString());
                    //System.out.println(pars.mainName(pars.buildDocument()));
                    break;
                case "2":
                    System.out.println("Поиск по полям Motobike: ) {");
                    System.out.println("1. Поиск по полю Vendor ");
                    System.out.println("2. Поиск по полю Model ");
                    System.out.println("3. Поиск по полю Age ");
                    System.out.println("4. Исходное меню");

                    break;
                case "3":
                    System.out.println("Добавление узла в файл XML: ");
                    addNode addNode = new addNode();
                    Parcer parcer = new Parcer();
                    ArrayList<Motobike> bikeList = parcer.parsMoto();
                    Document doc = parcer.buildDocument();
                    String mainName = parcer.mainName(doc);
                    ArrayList<Motobike> bikeListPlus = addNode.addnode(mainName, bikeList);
                    addNode.fileWriter(mainName, bikeListPlus);
                    break;
                case "4":
                    System.out.println("Удаление узлa в файле XML по номеру id");
                    Parcer parcer1 = new Parcer();
                    delNode delNode = new delNode();
                    addNode addNode1 = new addNode();
                    ArrayList<Motobike> bikeList1 = parcer1.parsMoto();
                    Document doc1 = parcer1.buildDocument();
                    String mainName1 = parcer1.mainName(doc1);
                    addNode1.fileWriter(mainName1, delNode.delNode(mainName1, bikeList1));
                    break;
                default:
                    System.out.println("Выберите один из пунктов меню, или нажмите <5> " +
                            "для выхода из программы\n");
                    break;
            }
        } while (choice != "5");
    }
}
