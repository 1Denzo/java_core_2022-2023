package LR11.Part2.Exersize8;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер односвязанного списка: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        NodeList node1 = HeadCreateNodeList.headCreateNodelist(size);
        System.out.println("Односвязанный список созданный с головы: ");
        PrintNodeList.printList(node1);
        NodeList node2 = TailCreateNodeList.TailCreateNodeList(size);
        System.out.println("\n" + "Односвязанный список созданный с хвоста: ");
        PrintNodeList.printList(node2);
    }
}
