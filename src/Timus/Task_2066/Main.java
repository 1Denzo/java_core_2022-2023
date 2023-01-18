package Timus.Task_2066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); //Число а
        int b = in.nextInt(); //Число b
        int c = in.nextInt(); //Число c
        if (b == 0 || b == 1 || c == 1) {
            System.out.println((a - b) - c);
        } else {
            System.out.println(a - (b * c));
        }
    }
}
