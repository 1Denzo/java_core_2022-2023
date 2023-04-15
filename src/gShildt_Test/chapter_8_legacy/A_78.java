package gShildt_Test.chapter_8_legacy;

public class A_78 {
    // Простой пример наследования
// создать суперкласс
        int i, j;

        void showij() {
            System.out.println("i и j: " + i + " " + j);
        }
    }
// создать подкласс путем расширения класса А
        class B extends A_78 {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}
    class Simpleinheritance {
        public static void main(String args[]) {
            A_78 superOb = new A_78();
            B subOb = new B();
// суперкласс может использоваться самостоятельно
            superOb.i = 10;
            superOb.j = 20;
            System.out.println("Coдepжимoe объекта superOb: ");
            superOb.showij();
            System.out.println();
/* Подкласс имеет доступ ко всем открытым членам
своего суперкласса. */
            subOb.i = 7;
            subOb.j = 8;
            subOb.k = 9;
            System.out.println("Coдepжимoe объекта subOb: ");
            subOb.showij();
            subOb.showk();
            System.out.println();
            System.out.println("Cyммa i, j и k в обьекте subOb:");
            subOb.sum();
        }
    }