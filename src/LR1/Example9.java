package LR1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        System.out.println("Input name of month: ");
    String month = in.nextLine();

    System.out.println("Number of days in a month: ");
    byte number = in.nextByte();
    System.out.println("Number of days in a " + month + ": " + number);
        in.close();
}
}
