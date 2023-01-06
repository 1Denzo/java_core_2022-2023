package gShildt_Test;

public class outer_67 {
    //Продемонстрировать применение внутреннего класса
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("вывoд: outer_x " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
// это внутренний класс
   class innerClassDemo {
                public static void main (String args []) {
                outer_67 outer = new outer_67();
                    outer.test();
    }
}