package LR10.Example1XML.ParcerXML;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class addNode {
    // Метод для добавления новых нодов в XML файл. Возвращает объект MotobikeList
    // c добавленными элементами motobike и правильным перестроенным атрибутом id

    public MotobikesList addnode() {
        Parcer parcer = new Parcer();
        MotobikesList motobikesList = parcer.parsMotoXML();
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
        ArrayList<Motobike> parent = motobikesList.getMotobikesList();
        for (int i = 0; i < parent.size(); i++) { //Добавление новых элементов в массив second
            if (i >= (delimiter-1) && i < (delimiter + elementNumber - 1)) {
                System.out.println("Введите название фирмы-изготовителя мотоцикла " + (i + 1) + ":");
                inVend = in.next();
                System.out.println("Введите название модели мотоцикла " + (i + 1) + ":");
                inModel = in.next();
                System.out.println("Введите год выпуска мотоцикла " + (i + 1) + ":");
                inAgeI = in.nextInt();
                inAge = (year - inAgeI);
                Motobike motobike2 = new Motobike((i + 1), inVend, inModel, inAge);
                parent.add(i, motobike2);
            } else {
                parent.get(i).setId(i + 1); //Устанавливаем правильную нумерацию атрибута id
            }
        }
        return new MotobikesList(mainName, parent);
    }
}




















        
