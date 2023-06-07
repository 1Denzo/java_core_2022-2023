package LR10.Example1XML.ParcerXML;

import java.io.IOException;
import java.util.Scanner;

public class mainMenu {
    Scanner in = new Scanner(System.in);
    String twoChoice1, twoChoice2 = "";
    boolean checker = false;

    public String Menu() throws IOException {
        String choice;
        //Runtime runtime = getRuntime();
        //Process process = runtime.exec("cls"); //для linux "clear", в виндовс "cls"
        System.out.print("\033[H\033[2J");
        System.out.println("Парсер XML v.0.7");
        System.out.println("Выберите действие: ");
        System.out.println(" 1. Парсинг файла");
        System.out.println(" 2. Поиск по полям в файле");
        System.out.println(" 3. Переписывание узла в файле");
        System.out.println(" 4. Добавление узла в файл");
        System.out.println(" 5. Удаление узлa в файле\n");

        System.out.println("Выберите один из пунктов меню, или нажмите <enter> для выхода из программы: ");
        choice = in.nextLine();
        return choice;
    }

    public void One() {
        String oneChoice = "";
        FileWorker fileWorker = new FileWorker();
        Parcer pars = new Parcer();
        MotobikesList motobikesList = pars.parsMotoXML();
        System.out.println(motobikesList.toString());
        do {
            System.out.println("Сохранить данные в файл .txt? (y/n)");
            oneChoice = in.nextLine();
            switch (oneChoice) {
                case "y":
                    fileWorker.txtFileWriter(motobikesList);
                    continue;
                case "n":
                    System.out.println("Ок");
                    break;
            }
        } while (oneChoice == "n");
    }

    public Byte Two1() {
        byte twoMenu = 0;
        do {
            System.out.println("Поиск по полям Motobike: ");
            System.out.println("1. Поиск по полю id ");
            System.out.println("2. Поиск по полю Vendor ");
            System.out.println("3. Поиск по полю Model ");
            System.out.println("4. Поиск по полю Age ");
            System.out.println("Выберите один из пунктов: ");
            twoChoice1 = in.nextLine();
            switch (twoChoice1) {
                case "1":
                    twoMenu = 1;
                    checker = true;
                    break;
                case "2":
                    twoMenu = 2;
                    checker = true;
                    break;
                case "3":
                    twoMenu = 3;
                    checker = true;
                    break;
                case "4":
                    twoMenu = 4;
                    checker = true;
                    break;
            }
        }
        while (checker != true);
        return twoMenu;
    }

    public short[] Two2() {
        short[] param = new short[2];
        do {
            System.out.println("1. Поиск по значению (например Age = 5, только положительные целые числа) ");
            System.out.println("2. Поиск по диапозону (напиример 3 < Age < 10)");
            System.out.println("Выберите один из пунктов: ");
            twoChoice2 = in.nextLine();
            switch (twoChoice2) {
                case "1":
                    System.out.println("Введите значение ");
                    param[0] = in.nextShort();
                    if (param[0] > 0) {
                        checker = true;
                    } else {
                        System.out.println("Неверный диапазон значений!!! Пожайлуста снова введите значение...");
                    }
                    break;
                case "2":
                    System.out.println("Введите ограничение параметра поиска снизу (больше чем...): ");
                    param[0] = in.nextShort();
                    System.out.println("Введите ограничение параметра поиска сверху (меньше чем...): ");
                    param[1] = in.nextShort();
                    if (param[1] > param[0]) {
                        checker = true;
                    } else {
                        System.out.println("Неверный диапазон значений!!! Пожайлуста снова введите значения...");
                    }
                    break;
            }
        }
        while (checker != true);
        return param;
    }
}
