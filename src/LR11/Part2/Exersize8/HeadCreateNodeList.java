package LR11.Part2.Exersize8;

import java.util.Scanner;

import static LR11.Part2.Exersize8.PrintNodeList.printList;

public class HeadCreateNodeList {

    public static NodeList headCreateNodelist(int size) {
        NodeList list = new NodeList(); // Инициализация односвязного списка
        // Вставка значений
        for (int i = 0; i < size; i++) {
            list = InsertNodeList.insert(list, i);
        }
        return list;
    }
}