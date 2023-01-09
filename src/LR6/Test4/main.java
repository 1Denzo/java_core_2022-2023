package LR6.Test4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("Ведите число для нахождения двойного факториала: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Test4 f = new Test4();
        System.out.println("Фaктopиaл " + num + " равен " + f.fact(num));
    }
}

