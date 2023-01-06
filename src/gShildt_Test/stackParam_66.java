package gShildt_Test;

public class stackParam_66 {
    //Усовершенствованный класс Stack, в котором
//используется свойство длины массива
    private int stck[];
    private int tos;

    // выделить память под стек и инициализировать его
    stackParam_66(int size) {
        stck = new int[size];
        tos = -1;
    }

    //разметить элемент в стеке
    void push(int item) {
        if (tos == stck.length - 1)
// использовать свойство длины массива
            System.out.println("Cтeк заполнен.");
        else
            stck[++tos] = item;
    }

    //извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else
            return stck[tos--];
    }
}
            class TestStack3 {
                public static void main(String args[]) {
                    stackParam_66 mystack1 = new stackParam_66(5);
                    stackParam_66 mystack2 = new stackParam_66(8);
//разместить числа в стеке
                    for (int i = 0; i < 5; i++) mystack1.push(i);
                    for(int i=0; i<8; i++) mystack2.push(i);
                    // извлечь эти числа из стека
                    System.out.println("Cтeк в mystack1:");
                    for(int i=0; i<5; i++)
                        System.out.print(mystack1.pop());
                    System. out .println ("\nСтек в mystack2: ");
                    for(int i=0; i<8; i++)
                        System.out.print(mystack2.pop());
                }
            }