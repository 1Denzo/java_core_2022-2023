package LR11.Part1;

public class Example5 {
    private static int step = 0;

    public static void main(String[] args) {

        System.out.println("Конечный результат: " + fact(5));
    }
    public static int fact(int n) {
        step++;
        System.out.println("Интерация: " + step + ", n=" + n);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fact(n-2) + fact(n-1);
        }
    }
}
