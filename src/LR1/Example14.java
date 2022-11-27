package LR1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Input x: ");
    int x = in.nextInt();
    int y = x - 1;
    int z = x + 1;
    int q = x + y + z;

    System.out.println("x - 1 = " + y);
    System.out.println("x = " + x);
    System.out.println("x + 1 = " + z);
    System.out.println("((x - 1)*x*(x + 1))^2 = " + Math.pow(q, 2));
    in.close();
}
}
