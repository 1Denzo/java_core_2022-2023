package coursework1;

import java.util.ArrayList;
import java.util.Scanner;

public class delNode {

    protected MotobikesList delNode(MotobikesList motobikesList) {

        Scanner in = new Scanner(System.in);
        String mainName = motobikesList.getMainName();
        ArrayList <Motobike> parent = motobikesList.getMotobikesList();
        System.out.println("Введите номер индификатора для удаляемого элемета списка " + mainName + ":");
        int idDelNode = in.nextInt();
        ArrayList<Motobike> first = new ArrayList(); // создаем два пустых списка для деления parent
        ArrayList<Motobike> second = new ArrayList();// создаем два пустых списка для деления parent
        // обрабатываем каждый элемент и добавляем его в первый или второй список в зависимости от его позиции
        for (int i = 0; i < parent.size(); i++) {
            if (i < (idDelNode - 1)) {
                first.add(parent.get(i));
            } else {
                second.add(parent.get(i));
            }
        }
        for (int i = 0; i < second.size(); i++) { //удаление нода из массива second
            if (i == 0) {
                second.remove(i); //
                second.get(i + 1).setId(idDelNode + i);
            } else {
                second.get(i).setId(idDelNode + i); //Устанавливаем правильную нумерацию атрибута id
            }
        }
        first.addAll(second); //объединяем списки
        MotobikesList motobikesList2 = new MotobikesList(mainName, first);
        System.out.println("Элемент с id " + idDelNode + " удален.");
        return motobikesList2;
    }
}
