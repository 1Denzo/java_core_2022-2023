package LR1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input x: ");
        int x = in.nextInt();
        System.out.println("Input y: ");
        int y = in.nextInt();

        int k = x + y;
        int m = x - y;

        System.out.println("x + y: " + k);
        System.out.println("x - y: " + m);

        in.close();
    }
}
