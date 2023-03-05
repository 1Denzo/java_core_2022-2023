package gShildt_Test.chapter_8_legacy;

public class A2_81 {
    // Использовать ключевое слово super с целью
    // предотвратить сокрытие имен
    int i;
}
        // создать подкласс путем расширения класса А
        class C extends A2_81 {
            int i; // этот член i скрывает член i из класса А
            C(int а, int b) {
                super.i = а; //член i из класса А
                i = b; //член i из класса В
            }
                void show () {
                    System.out.println("Члeн i в суперклассе: " + super.i);
                    System.out.println("Члeн i в подклассе: " + i);
                }
            }
                class UseSuper {
                    public static void main(String args[]) {
                        C subOb = new C(1, 2);
                        subOb.show();
                    }
                }
