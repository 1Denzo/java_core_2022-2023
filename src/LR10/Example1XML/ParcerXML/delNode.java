package LR10.Example1XML.ParcerXML;

import java.util.ArrayList;
import java.util.Scanner;

public class delNode {

    protected MotobikesList delNode(MotobikesList motobikesList) {

        Scanner in = new Scanner(System.in);
        String mainName = motobikesList.getMainName();
        ArrayList<Motobike> parent = motobikesList.getMotobikesList();
        boolean checker = false;
        int idDelNode;
        do {
            System.out.println("Введите номер индификатора для удаляемого элемета списка " + mainName + ":");
            idDelNode = in.nextInt();

            if (idDelNode >= 1 && idDelNode <= parent.size() + 1) {
                checker = true;
            } else {
                System.out.println("Число вне диапазона адресов массива!!! Введите правильное число!");
            }
        }
        while (!checker) ;
        for (int i = 0; i < parent.size(); i++) { //удаление нода из массива
            if (i == (idDelNode - 1)) {
                parent.remove(i);
                parent.get(i).setId(i + 1);//
            } else if (i >= idDelNode) {
                parent.get(i).setId(i + 1); //Устанавливаем правильную нумерацию атрибута id
            }
        }
        MotobikesList motobikesList2 = new MotobikesList(mainName, parent);
        System.out.println("Элемент " + idDelNode + " удален.");
        return motobikesList2;
    }
}
