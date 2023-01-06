package gShildt_Test;

public class stack_51 {
    // В этом классе определяется целочисленный стек, где
// можно хранить до 10 целочисленных значений
   int stack_51[] = new int[10];
    int tos;

    // инициализировать вершину стека
    stack_51() {
        tos = -1;
    }

    // разместить элемент в стеке
    void push (int item) {
        if (tos == 9)
            System.out.println("Cтeк заполнен.");
        else
            stack_51[++tos] = item;
        // извлечь элемент из стека
    }
        int pop() {
            if (tos < 0) {
                System.out.println("Cтeк не загружен.");
                return 0;
            } else {
                return stack_51[tos--];
            }
        }
    }
class TestStack {
    public static void main(String[] args) {
        stack_51 mystack1 = new stack_51();
        stack_51 mystack2 = new stack_51();
// разместить числа в стеке
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);
//извлечь эти числа из стека
        System.out.println("Coдepжимoe стека mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.print(mystack1.pop()+" ");
        System.out.println("\nCoдepжимoe стека mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.print(mystack2.pop()+" ");
    }
}