package gShildt_Test.chapter_8_inheritance;
class A3_83 {
    // Продемонстрировать порядок вызова конструкторов
// создать суперкласс
    A3_83() {
        System.out.println("B конструкторе А.");
    }
}
            // создать подкласс путем расширения класса А
            class В3_83 extends A3_83 {
                В3_83() {
                    System.out.println("B конструкторе В.");
                }
            }
                    //создать еще один подкласс путем расширения класса В
                    class C3_83 extends В3_83 {
                        C3_83() {
                            System.out.println("B конструкторе С.");
                        }
                    }
                            class CallingCons {
                                public static void main(String[] args) {
                                    C3_83 c = new C3_83();
                                }
                            }