package LR10.Example1XML.ParcerXML;

import org.w3c.dom.Document;

import java.io.IOException;

public class mainMenu {

    public char Menu() throws IOException {
    char choice;
        //Runtime runtime = getRuntime();
        //Process process = runtime.exec("cls"); //для linux "clear", в виндовс "cls"
        System.out.println("Парсер XML v.0.2\n:");
        System.out.println("Выберите действие: ");
        System.out.println(" 1. Парсинг в консоль файла XML");
        System.out.println(" 2. Поиск по полям в файле XML");
        System.out.println(" 3. Добавление узла в файл XML");
        System.out.println(" 4. Удаление узлa в файле XML");
        System.out.println(" 5. Выход\n");
        System.out.println("Bыбepитe нужный пункт:");
        choice = (char) System.in.read();
     return choice;
    }
}
