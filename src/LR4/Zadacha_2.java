package LR4;

import java.util.Scanner;

public class Zadacha_2 {
    public static void main(String[] args) {
        System.out.println("Введите высоту прямоугольного треугольника:");
        Scanner in = new Scanner(System.in);
                int x = in.nextInt();
        System.out.println("Введитите ширину прямоугольного треугольника:");
        Scanner in2 = new Scanner(System.in);
        int y = in.nextInt();
        char twoD[][] = new char[x][y];
        int i, j;
        char k = '+';
        for(i=0; i<x; i++) {
            for (j = 0; j <= i; j++) {
                twoD[i][j] = k;
                System.out.print(twoD[i][j]);
            }
            System.out.println();
        }

        }
    }

