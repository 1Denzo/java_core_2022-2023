package gShildt_Test;

public class overLoad2_53 {
    // Применить автоматическое преобразование типов к перегрузке
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }
//Перегружаемый метод, проверяющий наличие
// двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
//параметра типа double
    void test(double a) {
        System.out.println("Bнyтpeннee преобразование при вызове " + "test(double) а:" + a);
    }
}
                    class Over {
                        public static void main(String[] args) {
                            overLoad2_53 ob = new overLoad2_53();
                            int i = 88;
                            ob.test();
                            ob.test(10, 20);
                            ob.test(i); // здесь вызывается вариант метода test(double)
                            ob.test(123.2); //и здесь вызывается вариант метода test(douЬle)
                        }
                    }
