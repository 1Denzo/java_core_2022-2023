package gShildt_Test.chapter_8_legacy;

class A5_85 {
    //Переопределение метода
    int i, j;

    A5_85(int a, int b) {
        i = a;
        j = b;
    }

    //вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
class B5_85 extends A5_85 {
    int k;
    B5_85(int a, int b, int c) {
        super(a,b);
        k = c;
    }
    // вывести содержимое переменной k с помощью метода,
// переопределяющего метод show() из класса А
    void show (String msg) {
        System.out.println(msg + k);
        super.show(); //здесь вызывается метод show() из класса A
    }
}
class Override2 {
    public static void main(String[] args) {
        B5_85 subOb = new B5_85(1, 2, 3);
        subOb.show("Это k: ");
        // здесь вызывается метод show() из класса B
    }
}
