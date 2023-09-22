package LR11.Part2.Exersize8;

import java.util.Scanner;

public class InsertNodeList {
    // Метод вставки узла
    public static NodeList addFirst(NodeList list) {
        System.out.println("Введите значение для головного элемента: ");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        list.head = new NodeList.Node(value, list.head);
        return list;
    }
    public static NodeList.Node insert(NodeList.Node node, int data) {
        // Создание узла путем передачи данных конструктором
        NodeList.Node new_node = new NodeList.Node(data);
        // Если связанный список пуст тогда новый узел создается как голова списка
        if (node == null) {
            node = new_node;
        } else {
            // Иначе пройти до последнего узла и вставлять new_node там
            NodeList.Node last = node;
            while (last.next != null) {
                last = last.next;
            }
            // Вставить новый узел на место последнего за последним
            last.next = new_node;
        }
        // Вернуть односвязанный список
        return node;
    }
        public static NodeList insertNumNode(NodeList node) {
            System.out.println("Введите индекс для заменяемого элемента: ");
            Scanner in = new Scanner(System.in);
            int index = in.nextInt();
            System.out.println("Введите значение для заменяемого элемента: ");
            int value = in.nextInt();
            NodeList.Node newNode = new NodeList.Node(value, null);
            NodeList.Node ref = node.head; // временная переменная
            int k = 1; // счетчик элементов
            while (ref.next != null && (k < (index - 1))) {
                ref = ref.next;
                k++;
            }
            newNode.next = ref.next.next; // переброска ссылок при вставке элемента
            ref.next = newNode;
            return node;
        }
}
