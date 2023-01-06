package gShildt_Test;

class tset_59 {
    // Возврат объекта
    int a;
    tset_59(int i) {
        a = i;
    }
    tset_59 incrByTen() {
        tset_59 temp = new tset_59(a + 10);
        return temp;
    }
}
        class RetOb {
            public static void main(String[] args) {
                tset_59 ob1 = new tset_59(2);
                tset_59 ob2;
                ob2 = ob1.incrByTen();
                System.out.println("ob1.a: " + ob1.a);
                System.out.println("ob2.a: " + ob2.a);
                ob2 = ob2.incrByTen();
                System.out.println("оb2.а после второго увеличения значения: " + ob2.a);
            }
}
