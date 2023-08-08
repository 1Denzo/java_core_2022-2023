package coursework1;

import LR10.Example2JSON.JsonParcer;
import LR10.Example2JSON.Motobike1;
import LR10.Example2JSON.MotobikesList1;
import org.json.simple.parser.ParseException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class addNode {
    // Метод для добавления новых нодов в XML файл. Возвращает объект MotobikeList
    // c добавленными элементами motobike и правильным перестроенным атрибутом id
    public MotobikesList addnode() throws ParserConfigurationException {
        Parcer parcer = new Parcer();
        MotobikesList motobikesList = parcer.parsMotoXML();
        String mainName = motobikesList.getMainName();
        Scanner in = new Scanner(System.in);
        String inVend, inModel = null;
        int inAge, inAgeI, k = 0;
        LocalDate date = LocalDate.now(); // получаем текущую дату
        int year = date.getYear();
        System.out.println("Введите количество дополнительных элементов списка " + mainName + ":");
        int elementNumber = in.nextInt();
        System.out.println("Введите номер индификатора для первого добавляемого элемета списка " + mainName + ":");
        int delimiter = in.nextInt();
        // Общий метод разделения списка на два подсписка в Java
        ArrayList<Motobike> parent = motobikesList.getMotobikesList();
        ArrayList<Motobike> first = new ArrayList(); // создаем два пустых списка для деления parent
        ArrayList<Motobike> second = new ArrayList();// создаем два пустых списка для деления parent
        // обрабатываем каждый элемент parent и добавляем его в первый или второй список в зависимости от его позиции
        for (int i = 0; i < parent.size(); i++) {
            if (i < (delimiter - 1)) {
                first.add(parent.get(i));
            } else {
                second.add(parent.get(i));
            }
        }
        for (int i = 0; i < second.size(); i++) { //Добавление новых элементов в массив second
            if (i < elementNumber) {
                System.out.println("Введите название фирмы-изготовителя мотоцикла " + (i + 1) + ":");
                inVend = in.next();
                System.out.println("Введите название модели мотоцикла " + (i + 1) + ":");
                inModel = in.next();
                System.out.println("Введите год выпуска мотоцикла " + (i + 1) + ":");
                inAgeI = in.nextInt();
                inAge = (year - inAgeI);
                Motobike motobike2 = new Motobike((i + delimiter), inVend, inModel, inAge);
                second.add(i, motobike2);
            } else {
                second.get(i).setId(i + delimiter); //Устанавливаем правильную нумерацию атрибута id
            }
        }
        first.addAll(second); //объединяем списки
        MotobikesList motobikesList1 = new MotobikesList(mainName, first);
        return motobikesList1;
    }
    public MotobikesList1 addJsoNode() throws ParseException, IOException {
        JsonParcer parcer = new JsonParcer();
        MotobikesList1 motobikesList = parcer.parsJson();
        String mainName = motobikesList.getMainName();
        Scanner in = new Scanner(System.in);
        String inVend, inModel;
        int inAge, inAgeI;
        LocalDate date = LocalDate.now(); // получаем текущую дату
        int year = date.getYear();
        System.out.println("Введите количество дополнительных элементов списка " + mainName + ":");
        int elementNumber = in.nextInt();
        System.out.println("Введите номер индификатора для первого добавляемого элемета списка " + mainName + ":");
        int delimiter = in.nextInt();
        ArrayList<Motobike1> parent = motobikesList.getMotobikesList();
        for (int i = 0; i < parent.size(); i++) { //Добавление новых элементов в массив parent
            if (i >= (delimiter-1) && i < (delimiter + elementNumber - 1)) {
                System.out.println("Введите название фирмы-изготовителя мотоцикла " + (i + 1) + ":");
                inVend = in.next();
                System.out.println("Введите название модели мотоцикла " + (i + 1) + ":");
                inModel = in.next();
                System.out.println("Введите год выпуска мотоцикла " + (i + 1) + ":");
                inAgeI = in.nextInt();
                inAge = (year - inAgeI);
                Motobike1 motobike2 = new Motobike1(Integer.toString(i + 1), inVend, inModel, Integer.toString(inAge));
                parent.add(i, motobike2);
            } else {
                parent.get(i).setId(i + 1); //Устанавливаем правильную нумерацию атрибута id
            }
        }
        return new MotobikesList1(mainName, parent);
    }
}



















        
