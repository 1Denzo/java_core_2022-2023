package LR10.Example1XML.ParcerXML;



public class Main {
        //Использовать оператор цикла do-while для выбора пункта меню
        public static void main(String args[])
                throws java.io.IOException {
            char choice;
            do {
                System.out.println("Парсер XML v.0.1\n:");
                System.out.println("Выберите действие: ");
                System.out.println(" 1. Парсинг в консоль файла XML");
                System.out.println(" 2. Поиск по полям в файле XML");
                System.out.println(" 3. Добавление узла в файл XML");
                System.out.println(" 4. Удаление узлa в файле XML");
                System.out.println(" 5. Выход\n");
                System.out.println("Bыбepитe нужный пункт:");
                choice = (char) System.in.read();
            }
            while (choice < '1' || choice > '5') ;
            System.out.println("\n");
            switch (choice) {
                case '1':
                    Parcer pars = new Parcer();
                    Motobikes motoBikes = pars.pars();
                    System.out.println("Motobikes " + motoBikes.toString());
                    break;
                case '2':
                        System.out.println("Поиск по полям Motobike: ) {");
                        System.out.println("1. Поиск по полю Vendor ");
                        System.out.println("2. Поиск по полю Model ");
                        System.out.println("3. Поиск по полю Age ");
                        System.out.println("4. Исходное меню");
                        choice = (char) System.in.read();
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
                    System.out.println("3. Удаление узлa в файле XML по значению поля Age");
                    break;
                case '5':
                    System.out.print("Пока!");
                    break;
            }
        }
    }
