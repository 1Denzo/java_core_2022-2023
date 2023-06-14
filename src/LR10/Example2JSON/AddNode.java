package LR10.Example2JSON;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AddNode {
    // Метод для добавления новых узлов. Возвращает объект MotobikeList
    // c добавленными элементами motobike и правильным перестроенным атрибутом id

    public MotobikesList1 addnode() throws ParseException, IOException {
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
        for (int i = 0; i < parent.size(); i++) { //Добавление новых элементов в массив second
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




















        
