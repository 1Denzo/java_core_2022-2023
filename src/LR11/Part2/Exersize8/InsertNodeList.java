package LR11.Part2.Exersize8;

public class InsertNodeList {
    // Метод вставки узла
    public static NodeList insert(NodeList list, int data) {
        // Создание узла путем передачи данных конструктором
        NodeList.Node new_node = new NodeList.Node(data);
        // Если связанный список пуст тогда новый узел создается как голова списка
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Иначе пройти до последнего узла и вставлять new_node там
            NodeList.Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Вставить новый узел на место последнего за последним
            last.next = new_node;
        }
        // Вернуть односвязанный список
        return list;
    }
}
