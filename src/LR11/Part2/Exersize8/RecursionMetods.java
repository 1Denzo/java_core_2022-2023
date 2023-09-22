package LR11.Part2.Exersize8;
public class RecursionMetods {
    static NodeList.Node createHeadRec(int size) {
        if (size > 0) {
            return new NodeList.Node(size - 1, createHeadRec(size - 1));
        }
        return null;
    }
    static NodeList.Node createTailRec(int size, NodeList.Node node) {
        if (size == 0 ) {
            return node;
        }
            return new NodeList.Node(size - 1, createTailRec(size - 1, node));
        }
    public static void printListRec(NodeList.Node list)  {
        NodeList.Node currNode = list;
        // Обход элементов NodeList
        while (list.next == null) {
            // Распечатка данных из узла односвязанного списка
            System.out.print(currNode.data + " ");
            // Go to next node
            currNode = currNode.next;
        }
    }
}