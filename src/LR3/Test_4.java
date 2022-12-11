package LR3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Test_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа выводит все целые числа между двумя заданными числами.");
        System.out.println("Введите первое число:");
        int num1 = in.nextInt();
        System.out.println("Введите второе число:");
        int num2 = in.nextInt();
        if (num1 >= num2) {
            while (num2 <= num1) {
                System.out.println(num2);
                num2++;
            }
        } else if (num2 >= num1) {
            while (num1 <= num2) {
                System.out.println(num1);
                num1++;
            }
        }
    }
}
