package gShildt_Test;

public class stackAcces_63 {
        // В этом классе определяется целочисленный стек, где
// можно хранить до 10 целочисленных значений
        private int stackAcces_63[] = new int[10];
        private int tos;

        // инициализировать вершину стека
        stackAcces_63() {
            tos = -1;
        }

        // разместить элемент в стеке
        void push (int item) {
            if (tos == 9)
                System.out.println("Cтeк заполнен.");
            else
                stackAcces_63[++tos] = item;
            // извлечь элемент из стека
        }
        int pop() {
            if (tos < 0) {
                System.out.println("Cтeк не загружен.");
                return 0;
            } else {
                return stackAcces_63[tos--];
            }
        }
    }
    class TestStack2 {
        public static void main(String[] args) {
            stackAcces_63 mystack1 = new stackAcces_63();
            stackAcces_63 mystack2 = new stackAcces_63();
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
