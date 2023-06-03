package LR10.Example1XML.ParcerXML;

import java.util.ArrayList;
import java.util.Scanner;

public class delNode {

    protected ArrayList<Motobike> delNode(String mainName, ArrayList<Motobike> bikeList) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер индификатора для удаляемого элемета списка " + mainName + ":");
        int idDelNode = in.nextInt();
        ArrayList<Motobike> parent = bikeList;
        ArrayList<Motobike> first = new ArrayList(); // создаем два пустых списка для деления parent
        ArrayList<Motobike> second = new ArrayList();// создаем два пустых списка для деления parent
        // обрабатываем каждый элемент и добавляем его в первый или второй список в зависимости от его позиции
        for (int i = 0; i < parent.size(); i++) {
            if (i < (idDelNode - 2)) {
                first.add(parent.get(i));
            } else {
                second.add(parent.get(i));
            }
        }
        for (int i = 0; i < second.size(); i++) { //удаление нода из массива MotobikeList
            if (i == 0) {
                second.remove(i);
            } else {
                second.get(i).setId(idDelNode + i); //Устанавливаем правильную нумерацию атрибута id
            }
        }
        first.addAll(second); //объединяем списки
        System.out.println("Элемент с id " + idDelNode + " удален.");
        return first;
    }
}
