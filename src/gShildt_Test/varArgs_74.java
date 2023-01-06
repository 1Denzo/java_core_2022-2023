package gShildt_Test;

public class varArgs_74 {
    // Использовать аргументы переменной
    // длины вместе со стандартными аргументами
    // В данном примере msg - обычный параметр,
    // а v - параметр переменной длины
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + "Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest("Один параметр переменной длины: ", 10);
        vaTest("Tpи параметра переменной длины: ", 1, 2, 3);
        vaTest("Без параметров переменной длины: ");
    }
}