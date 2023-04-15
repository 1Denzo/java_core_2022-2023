package gShildt_Test.chapter_8_legacy;
class A3_83 {
    // Продемонстрировать порядок вызова конструкторов
// создать суперкласс
    A3_83() {
        System.out.println("B конструкторе А.");
    }
}
            // создать подкласс путем расширения класса А
            class B3_83 extends A3_83 {
                B3_83() {
                    System.out.println("B конструкторе В.");
                }
            }
                    //создать еще один подкласс путем расширения класса В
                    class C3_83 extends B3_83 {
                        C3_83() {
                            System.out.println("B конструкторе С.");
                        }
                    }
                            class CallingCons {
                                public static void main(String[] args) {
                                    C3_83 c = new C3_83();
                                }
                            }