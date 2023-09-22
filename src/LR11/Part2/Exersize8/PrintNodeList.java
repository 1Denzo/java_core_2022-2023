package LR11.Part2.Exersize8;

public class PrintNodeList {

    // Метод печати односвязанного списка в консоль
    public static void printList(NodeList.Node list)
    {
        NodeList.Node currNode = list;

        System.out.print("Nodelist: ");

        // Обход элементов NodeList
        while (currNode != null) {
            // Распечатка данных из узла односвязанного списка
            System.out.print(currNode.data + " ");
            // Go to next node
            currNode = currNode.next;
        }
    }
}
