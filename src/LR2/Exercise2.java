package LR2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Ввведите целое число:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result1 = num % 5;
        int result2 = num % 7;
        if (result1 == 2) {
            System.out.println("Остаток деления числа " + num + " на 5 равен двум.");
        } else {
            System.out.println("Остаток деления числа " + num + " на 5 не равен двум.");
        }
        if (result2 == 1) {
            System.out.println("Число " + num + " делится на 7 c остатком 1.");
        } else {
            System.out.println("Число " + num + " не делится на 7 c остатком 1.");
        }
    }
    }

