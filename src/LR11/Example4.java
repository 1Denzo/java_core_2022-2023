package LR11;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(fact(15));
    }
    public static long fact(long n) {
        long result;
        if (n == 1) return 1;
        else {
            result = fact(n-1) * n;
            return result;
        }
    }
}
