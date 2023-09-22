package LR11.Part2.Exersize8;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер односвязанного списка: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        NodeList.Node node1 = HeadCreateNodeList.headCreateNodelist(size);
        System.out.println("Односвязанный список созданный с головы: ");
        PrintNodeList.printList(node1);
        NodeList.Node node2 = TailCreateNodeList.TailCreateNodeList(size);
        System.out.println("\n" + "Односвязанный список созданный с хвоста: ");
        PrintNodeList.printList(node2);
        /*NodeList node3 = AddFirst.addFirst(node1);
        System.out.println("Добавление нового элемента с головы списка: ");
        PrintNodeList.printList(node3);*/
        /*System.out.println("Метод вставки элемента по индексу в список: ");
        NodeList node3 = InsertNumNode.insertNumNode(node1);
        PrintNodeList.printList(node3);*/
        /*System.out.println("\n" + "Метод удаления элемента в конце списка: ");
        NodeList node4 = RemoveLastNode.removeLast(node1);
        PrintNodeList.printList(node4);*/
        /*System.out.println("\n" + "Метод удаления элемента в начале списка: ");
        NodeList node5 = RemoveFirstNode.removeFirst(node1);
        PrintNodeList.printList(node5);*/
        /*System.out.println("\n" + "Метод удаления элемента по индексу списка: ");
        NodeList node6 = RemoveNode.removeNumNode(node1);
        PrintNodeList.printList(node6);*/
        System.out.println("\n" + "Метод создания списка с головы рекурсией: ");
        NodeList.Node node7 = null;
        node7 = RecursionMetods.createHeadRec(new NodeList.Node(size, null), size);
        PrintNodeList.printList(node7);
        System.out.println("\n" + "Метод создания списка с хвоста рекурсией: ");
        node7 = RecursionMetods.createTailRec(size);
        PrintNodeList.printList(node7);
    }
}
