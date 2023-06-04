package LR10.Example1XML.ParcerXML;

import java.io.IOException;
import java.util.Scanner;

public class mainMenu {
    Scanner in = new Scanner(System.in);
    public String Menu() throws IOException {
        String choice;
        //Runtime runtime = getRuntime();
        //Process process = runtime.exec("cls"); //для linux "clear", в виндовс "cls"
        System.out.print("\033[H\033[2J");
        System.out.println("Парсер XML v.0.7");
        System.out.println("Выберите действие: ");
        System.out.println(" 1. Парсинг файла XML");
        System.out.println(" 2. Поиск по полям в файле XML");
        System.out.println(" 3. Добавление узла в файл XML");
        System.out.println(" 4. Удаление узлa в файле XML\n");
        System.out.println("Выберите один из пунктов меню, или нажмите <enter> для выхода из программы: ");
        choice = in.nextLine();
        return choice;
    }
    public void One() {
        String oneChoice = "";
        FileWorker fileWorker = new FileWorker();
        Parcer pars = new Parcer();
        MotobikesList motobikesList = pars.parsMoto();
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
                    break;}
            }while (oneChoice == "n");
    }
    }
