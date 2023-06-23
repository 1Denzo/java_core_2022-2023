package LR10.Example1XML.ParcerXML;

import java.util.Scanner;

public class mainMenu {
        String twoChoice1, twoChoice2 = "";
    boolean checker = false;

    public String Menu() {
        String choice;
        Scanner in = new Scanner(System.in);
        //Runtime runtime = getRuntime();
        //Process process = runtime.exec("cls"); //для linux "clear", в виндовс "cls"
        System.out.print("\033[H\033[2J");
        System.out.println("Парсер XML v.0.9");
        System.out.println("Выберите действие: ");
        System.out.println(" 1. Парсинг файла");
        System.out.println(" 2. Поиск по полям в файле");
        System.out.println(" 3. Переписывание узла в файле");
        System.out.println(" 4. Добавление узла в файл");
        System.out.println(" 5. Удаление узлa в файле");

        System.out.println("Выберите один из пунктов меню, или нажмите <enter> для выхода из программы: ");
        choice = in.nextLine();
        return choice;
    }

    public void One() {
        String oneChoice;
        FileWorker fileWorker = new FileWorker();
        Parcer pars = new Parcer();
        MotobikesList motobikesList = pars.parsMotoXML();
        System.out.println(motobikesList.toString());
        do {
            Scanner in = new Scanner(System.in);
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
        } while (oneChoice.equals("n"));
    }

    public String Two1() {
        String twoMenu = "";
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Поиск по полям Motobike: ");
            System.out.println("1. Поиск по полю id ");
            System.out.println("2. Поиск по полю Vendor ");
            System.out.println("3. Поиск по полю Model ");
            System.out.println("4. Поиск по полю Age ");
            System.out.println("Выберите один из пунктов: ");
            twoChoice1 = in.nextLine();
            switch (twoChoice1) {
                case "1":
                    twoMenu = "id";
                    checker = true;
                    break;
                case "2":
                    twoMenu = "Vendor";
                    checker = true;
                    break;
                case "3":
                    twoMenu = "Model";
                    checker = true;
                    break;
                case "4":
                    twoMenu = "Age";
                    checker = true;
                    break;
            }
        }
        while (!checker);
        return twoMenu;
    }

    public short[] Two2() {
        short[] param = new short[2];
        do {
            checker = false;
            Scanner in = new Scanner(System.in);
            System.out.println("1. Поиск по значению (например Age = 5, только положительные целые числа) ");
            System.out.println("2. Поиск по диапозону (напиример 3 < Age < 10, только положительный диапазон)");
            System.out.println("Выберите один из пунктов: ");
            twoChoice2 = in.nextLine();
            switch (twoChoice2) {
                case "1":
                        do {
                            try {
                                Scanner in2 = new Scanner(System.in);
                        System.out.println("Введите значение ");
                        param[0] = in2.nextShort();
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода параметра! Пожайлуста, снова введите значение..." + e);
                    }
                    if (param[0] > 0) {
                        checker = true;
                    }
                        }
                    while (!checker);
                    break;
                case "2":
                    do {
                        try {
                            Scanner in3 = new Scanner(System.in);
                            //param[0] = 0;
                            System.out.println("Введите ограничение параметра поиска снизу, целое положительное число (больше чем...): ");
                            param[0] = in3.nextShort();
                        } catch (Exception e) {
                            System.out.println("Ошибка ввода параметра! Пожайлуста, снова введите значение..." + e);
                        }
                        try {
                            Scanner in1 = new Scanner(System.in);
                            //param[1] = 0;
                            System.out.println("Введите ограничение параметра поиска сверху, целое положительное число (меньше чем...): ");
                            param[1] = in1.nextShort();
                        } catch (Exception e) {
                            System.out.println("Ошибка ввода параметра! Пожайлуста, снова введите значение..." + e);
                        } if (param[0] > 0) {
                            if (param[1] > 0) {
                                if (param[1] > param[0]) {
                                    checker = true;
                                } else {
                                    System.out.println("Неверный диапазон значений!!! Верхняя граница меньше нижней, пожайлуста снова введите значения границ диапазона.");
                                }
                            } else {
                                System.out.println("Верхняя граница диапозона - не положительное число! Пожайлуста снова введите значения границ диапазона.");
                            }
                        } else {
                            System.out.println("Нижняя граница диапозона - не положительное число! Пожайлуста снова введите значения границ диапазона.");
                            }
                    }
                        while (!checker);
                    break;
        }}
        while (!checker);
        return param;
}}
