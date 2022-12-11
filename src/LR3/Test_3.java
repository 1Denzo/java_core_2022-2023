package LR3;

import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {
        System.out.println("Введите количесвто цифр в последовательности Фибоначчи: ");
        Scanner in = new Scanner(System.in);
        int fib_Num = in.nextInt();
        int a1 = 1;
        int a2 = 0;
        int a = 0;
        for (int k = 0; k <= fib_Num; k++) {
            switch (k){
                case 0:
                    System.out.println("1 число последовательности " + a1);
                    break;
                default:
                    if (k >= 1) {
                        if (k <= fib_Num) {
                            a = a1 + a2;
                            System.out.println((k + 1) + " число последовательности " + a);
                        a2 = a1;
                        a1 = a;
                        }
                    }
                    break;
            }
        }
    }
}
