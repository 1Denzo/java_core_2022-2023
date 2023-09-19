package LR11.Part2.Exersize8;

public class NodeList { // Программа на Java для реализации односвязанного списка
    Node head; // Голова односвязанного списка

    static class Node { // Внутренний класс узлов односвязанного списка
        int data;
        Node next;
        Node(int d) { // Конструктор класса Node c одной переменной для хвоста
            data = d;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}



