package LR6.Test4;

public class Test4 {
    //Простой пример рекурсии это рекурсивный метод
    int fact(int n) {
        int result;
        if (n == 1) return 1;
        result = fact(n - 2) * n;
        return result;
    }
}
