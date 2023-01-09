package LR6.Test5;

public class Test5 {
        //Простой пример рекурсии это рекурсивный метод
        int sqr(int n) {
            int result;
            if (n == 1) return 1;
            result = sqr(n - 1) + n*n;
            return result;
        }
    }
