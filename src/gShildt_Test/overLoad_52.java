package gShildt_Test;

public class overLoad_52 {
    // Продемонстрировать перегрузку методов
        void test () {
            System.out.println("Пapaмeтpы отсутствуют");
        }
// Перегружаемый метод, проверяющий наличие
// одного целочисленного параметра
            void test ( int a) {
                System.out.println("a: " + a);
            }
// Перегружаемый метод, проверяющий наличие
// двух целочисленных параметров
                void test ( int a, int b) {
                    System.out.println("a и b: " + a + " " + b);
// Перегружаемый метод, проверяющий наличие
//параметра типа double
                }
                    double test ( double a){
                        System.out.println("double а: " + a);
                        return a * a;
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