package LR11;

import java.util.Scanner;
public class Example6 {
    private static int stp = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа для перевода десятичного числа в двоичное");
        System.out.println("Введите число: ");
        int n = in.nextInt();
        m(n);
    }
    public static void m(int n) {
        int k;
        StringBuilder tmp = new StringBuilder("");
        if (n != 0) {
            k = n % 2;
            tmp.append(k);
            m(n / 2);
            System.out.print(tmp);
        }
    }
    }