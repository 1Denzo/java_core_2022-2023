package gShildt_Test;

public class overLoad_52 {
    // Продемонстрировать перегрузку методов
        void test () {
            System.out.println("Пapaмeтpы отсутствуют");
        }
// Перегружаемый метод, проверяющий наличие
// одного целочисленного параметра
            void test ( int а) {
                System.out.println("a: " + а);
            }
// Перегружаемый метод, проверяющий наличие
// двух целочисленных параметров
                void test ( int а, int b) {
                    System.out.println("a и b: " + а + " " + b);
// Перегружаемый метод, проверяющий наличие
//параметра типа double
                }
                    double test ( double а){
                        System.out.println("double а: " + а);
                        return а * а;
                    }
                }
                        class Overload {
                            public static void main(String args[]) {
                                overLoad_52 ok = new overLoad_52();
                                double result;
// вызвать все варианты метода test()
                                ok.test();
                                ok.test(10);
                                ok.test(20, 20);
                                result = ok.test(123.25);
                                System.out.println("Результат вызова ob.test(123.25): " + result);
                            }
                        }