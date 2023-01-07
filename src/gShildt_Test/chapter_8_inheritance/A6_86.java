package gShildt_Test.chapter_8_inheritance;

public class A6_86 {
    // Динамическая диспетчеризация методов
    void callme(){
System.out.println("B методе callme() из класса А");
}
}
        class b6 extends A6_86 {
            // переопределить метод callme()
            void callme() {
                System.out.println("B методе callme() из класса В");
            }
        }
                class C6 extends A6_86 {
                    // переопределить метод callme()
                    void callme() {
                        System.out.println("B методе callme() из класса С");
                    }
                }
                        class Dispatch {
                            public static void main(String[] args) {
                                A6_86 a = new A6_86(); // объект класса А
                                b6 b = new b6(); // объект класса В
                                C6 c = new C6(); //объект класса С
                                A6_86 r; // получить ссылку на объект типа А
                                r = a; // переменная r ссылается на объект типа А
                                r.callme(); // вызвать вариант метода callme(),
//определенный в классе А
                                r = b; // переменная r ссылается на объект типа в
                                r.callme(); //вызвать вариант метода callme(),
//определенный в классе В
                                r = c; // переменная r ссылается на объект типа С
                                r.callme(); // вызвать вариант метода callme(), определенный в классе С
                            }
                        }