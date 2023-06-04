package LR10.Example1XML.ParcerXML;

import org.w3c.dom.Document;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {

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
                    menu.One();
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
                    Parcer parcer = new Parcer();
                    addNode addNode = new addNode();
                    FileWorker fileWorker = new FileWorker();
                    MotobikesList motobikesList1 = addNode.addnode();
                    Document doc = parcer.docCreator(motobikesList1);
                    fileWorker.fileWriter(doc);
                    break;
                case "4":
                    System.out.println("Удаление узлa в файле XML по номеру id");
                    Parcer parcer1 = new Parcer();
                    FileWorker fileWorker1 = new FileWorker();
                    MotobikesList motobikesList3 = parcer1.parsMoto();
                    delNode delNode = new delNode();
                    MotobikesList motobikesList4 = delNode.delNode(motobikesList3);
                    Document doc1 = parcer1.docCreator(motobikesList4);
                    fileWorker1.fileWriter(doc1);
                    break;
            }
        } while (!choice.isEmpty());
    }
}
