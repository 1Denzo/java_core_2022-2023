package LR11.Part1;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(fact(8));
    }
    public static long fact(long n) {
        if (n == 1) return 1;
        else {
            long result = fact(n-1) * n;
            return result;
        }
    }
}
