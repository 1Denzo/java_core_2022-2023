package LR11.Part2.Exersize8;
public class RecursionMetods {
    static NodeList.Node createHeadRec(NodeList.Node node, int size) {
        if (size == 0) {
            return null;
        } node.next = createHeadRec(new NodeList.Node(node.data - 1, null), size -1);
return node;
    }
    static NodeList.Node createTailRec(int size) {
        if (size > 0 ) {
            return new NodeList.Node(size - 1, createTailRec(size - 1));
        } else {
            return null;
        }
    }
    }

