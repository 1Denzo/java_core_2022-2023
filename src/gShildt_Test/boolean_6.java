package gShildt_Test;

public class boolean_6 {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);
        // Значение может управлять оператором if
        if (b) System.out.println("Этот код выполняется.");
        b = false;
        if (b) System.out.println("Этот код не выполняется.");
        // результат сравнения - значение типа boolean;
        System.out.println("10 > 9 " + (10 > 9));
    }
}
