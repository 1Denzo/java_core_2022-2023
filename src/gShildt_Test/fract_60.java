package gShildt_Test;

 class fact_60 {
     //Простой пример рекурсии это рекурсивный метод
     int fact(int n) {
         int result;
         if (n == 1) return 1;
         result = fact(n - 1) * n;
         return result;
     }
 }
             class Recursion {
                 public static void main(String[] args) {
                     fact_60 f = new fact_60();
                     System.out.println("Фaктopиaл 3 равен " + f.fact(3));
                     System.out.println("Фaктopиaл 4 равен " + f.fact(4));
                     System.out.println("Фaктopиaл 10 равен " + f.fact(10));
                 }
 }
