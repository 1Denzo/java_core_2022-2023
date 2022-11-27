package LR1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input x: ");
        int x = in.nextInt();
        System.out.println("Input y: ");
        int y = in.nextInt();

        x = x + y;

        System.out.println("x + y: " + x);

        in.close();
    }
}