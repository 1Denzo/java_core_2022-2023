package LR10.Example1XML.ParcerXML;


import java.awt.*;
import java.io.IOException;

public class Main {
    private static Runtime runtime;

    //Использовать оператор цикла do-while для выбора пункта меню
        public static void main(String args[])
                throws IOException {
            char choice;
            do {
                mainMenu menu = new mainMenu();
                choice = menu.Menu();
            }
            while (choice < '1' || choice > '5') ;
            System.out.println("\n");
            switch (choice) {
                case '1':
                    Parcer pars = new Parcer();
                    MotobikesList motobikesList = pars.parsMoto();
                    System.out.println(motobikesList.toString());
                    break;
                case '2':
                        System.out.println("Поиск по полям Motobike: ) {");
                        System.out.println("1. Поиск по полю Vendor ");
                        System.out.println("2. Поиск по полю Model ");
                        System.out.println("3. Поиск по полю Age ");
                        System.out.println("4. Исходное меню");
                    break;
                case '3':
                    System.out.println("Добавление узла в файл XML: ");
                    System.out.println("Ручной ввод элемента Motobike: ");
                    break;
                case '4':
                    System.out.println("Удаление узлa в файле XML: ");
                    System.out.println("1. Удаление узлa в файле XML по номеру id");
                    System.out.println("2. Удаление узлa в файле XML по значению поля Vendor");
                    System.out.println("3. Удаление узлa в файле XML по значению поля Model");
                    System.out.println("4. Удаление узлa в файле XML по значению поля Age");
                    break;
                case '5':
                    System.out.print("Пока!");
                    break;
            }
        }
}
