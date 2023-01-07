package gShildt_Test.chapter_8_inheritance;

public class A4_84 {
    //Переопределение метода
    int i, j;

    A4_84(int а, int b) {
        i = а;
        j = b;
    }

    //вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
            class B4_84 extends A4_84 {
            int k;
B4_84(int a, int b, int c) {
    super(a,b);
    k = c;
}
// вывести содержимое переменной k с помощью метода,
// переопределяющего метод show() из класса А
        void show () {
            System.out.println("k: " + k);
            super.show(); //здесь вызывается метод show() из класса A
        }
            }
class Override {
    public static void main(String[] args) {
        B4_84 subOb = new B4_84(1, 2, 3);
        subOb.show();
        // здесь вызывается метод show() из класса B
    }
}