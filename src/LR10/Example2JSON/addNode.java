package LR10.Example2JSON;

import LR10.Example1XML.ParcerXML.Motobike;
import LR10.Example1XML.ParcerXML.MotobikesList;
import LR10.Example1XML.ParcerXML.Parcer;

import javax.xml.parsers.ParserConfigurationException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class addNode {
    // Метод для добавления новых нодов в XML файл. Возвращает объект MotobikeList
    // c добавленными элементами motobike и правильным перестроенным атрибутом id

    public LR10.Example1XML.ParcerXML.MotobikesList addnode() throws ParserConfigurationException {
        Parcer parcer = new Parcer();
        LR10.Example1XML.ParcerXML.MotobikesList motobikesList = parcer.parsMotoXML();
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
        ArrayList<LR10.Example1XML.ParcerXML.Motobike> parent = motobikesList.getMotobikesList();
        ArrayList<LR10.Example1XML.ParcerXML.Motobike> first = new ArrayList(); // создаем два пустых списка для деления parent
        ArrayList<LR10.Example1XML.ParcerXML.Motobike> second = new ArrayList();// создаем два пустых списка для деления parent
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
                LR10.Example1XML.ParcerXML.Motobike motobike2 = new Motobike((i + delimiter), inVend, inModel, inAge);
                second.add(i, motobike2);
            } else {
                second.get(i).setId(i + delimiter); //Устанавливаем правильную нумерацию атрибута id
            }
        }
        first.addAll(second); //объединяем списки
        LR10.Example1XML.ParcerXML.MotobikesList motobikesList1 = new MotobikesList(mainName, first);
        return motobikesList1;
    }
        }




















        
