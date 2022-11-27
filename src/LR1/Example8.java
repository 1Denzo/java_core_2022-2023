package LR1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day of week: ");
        String day = in.nextLine();

        System.out.println("Input name of month: ");
        String month = in.nextLine();

        System.out.println("Input day number in month: ");
        byte number = in.nextByte();

        System.out.println("Day of week: " + day);
        System.out.println("Day of month: " + number);
        System.out.println("Month: " + month);
        in.close();
    }
}