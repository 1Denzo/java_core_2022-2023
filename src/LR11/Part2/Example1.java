package LR11.Part2;

class Node { //Класс структура элемента списка
public int value; // значение
public  Node next; // поле - ссылка (указатель) на следующий узел
Node(int value, Node next) {
this.value = value;
this.next = next;
}
}