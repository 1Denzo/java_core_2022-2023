package LR11.Part2.Exersize8;

public class HeadCreateNodeList {

    public static NodeList.Node headCreateNodelist(int size) {
        NodeList.Node head = null; // Инициализация односвязного списка
        // Вставка значений
        for (int i = size - 1; 0 <= i ; i--) {
            head = new NodeList.Node(i, head);
        }
        return head;
    }
}