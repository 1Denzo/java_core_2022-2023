package LR2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Ввведите целое число:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result1 = num % 4;
               if (result1 == 0) {
            System.out.println("Число " + num + " делится на 4 без остатка.");
        } else {
            System.out.println("Число " + num + " на не делится на 4 без остатка.");
        }
               if (num<10){
                   System.out.println("Число " + num + " меньше 10.");
               }
               else {
                   System.out.println("Число " + num + " больше или равно 10.");
               }
    }
}
