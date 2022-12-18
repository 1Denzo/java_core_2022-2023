package LR4;

import java.util.Scanner;

public class Zadacha_3 {
    public static void main(String[] args) {
        System.out.println("Введите высоту прямоугольника:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Введите ширину прямоугольника:");
        Scanner in2 = new Scanner(System.in);
        int y = in2.nextInt();
        int twoD[][] = new int[x][y];
        int i, j, k;
        for (i = 0; i < x - 1; i++) {
            for (j = 0; j < y - 1; j++) {
                k = 2;
                twoD[i][j] = k;
                System.out.print(twoD[i][j]);
            }
            System.out.println();
        }
    }
}