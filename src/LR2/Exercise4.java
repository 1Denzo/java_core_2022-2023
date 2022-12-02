package LR2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Ввведите целое число:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num >=5 && num <=10) {
            System.out.printf("Число " + num + " в диапазоне от 5 до 10 включитетельно.");
        }
        else {
            System.out.printf("Число " + num + " вне диапазона от 5 до 10 включитетельно.");
        }
    }
    }
