package LR11.Part2.Exersize8;

import java.util.Scanner;

public class RemoveNode {
    static NodeList removeFirst(NodeList node) {
        node.head = node.head.next;
        return node;
    }
    public static NodeList removeLast(NodeList node) {
        NodeList.Node ref = node.head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
        return node;
    }
    public static NodeList removeNumNode(NodeList node) {
        System.out.println("Введите индекс для удаляемого элемента: ");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        NodeList.Node ref = node.head; // временная переменная
        int k = 1; // счетчик элементов
        while (ref.next != null && (k < (index - 1))) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next; // переброска ссылок при удалении элемента
        return node;
    }
}
