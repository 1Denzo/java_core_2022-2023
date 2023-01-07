package gShildt_Test.chapter_8_inheritance;

abstract class abstract_88 {
    // Простой пример абстракции
    abstract void callme();

    // абстрактные классы все же могут
// содержать конкретные методы
    void callmetoo() {
        System.out.println("Этo конкретный метод.");
    }
}
        class B8 extends abstract_88 {
            void callme() {
                System.out.println(
                        "Реализация метода callme() в классе В.");
            }
        }
                class AbstractDemo {
                    public static void main(String[] args) {
                        B8 b = new B8();
                        b.callme();
                        b.callmetoo();
                    }
                }