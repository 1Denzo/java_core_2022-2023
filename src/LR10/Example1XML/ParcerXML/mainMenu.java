package LR10.Example1XML.ParcerXML;

import java.io.IOException;
import java.util.Scanner;

public class mainMenu {

    public String Menu() throws IOException {
    String choice;
        Scanner in = new Scanner(System.in);
        //Runtime runtime = getRuntime();
        //Process process = runtime.exec("cls"); //для linux "clear", в виндовс "cls"
        System.out.print("\033[H\033[2J");
        System.out.println("Парсер XML v.0.6\n:");
        System.out.println("Выберите действие: ");
        System.out.println(" 1. Парсинг в консоль файла XML");
        System.out.println(" 2. Поиск по полям в файле XML");
        System.out.println(" 3. Добавление узла в файл XML");
        System.out.println(" 4. Удаление узлa в файле XML");
        System.out.println(" 5. Выход\n");
        System.out.println("Bыбepитe пункт:");
        choice = in.nextLine();
     return choice;
    }
}
