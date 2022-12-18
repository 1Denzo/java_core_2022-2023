package LR4;

import java.util.Random;
import java.util.Scanner;

public class Zadacha_5 {
    public static void main(String[] args) {
        System.out.println("Введите количество строк матрицы:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Введитите количество столбцов матрицы:");
        Scanner in2 = new Scanner(System.in);
        int y = in2.nextInt();
        int num[][] = new int[x][y];
        int mun[][] = new int[y][x];
        int i, j;
        Random random = new Random();
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                num[i][j] = random.nextInt(100);
                mun[j][i] = num[i][j];
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Транспонированная матрица:");
for (j = 0; j < y-1 ; j++) {
    for ( i = 0 ; i < x; i++) {
        System.out.print(mun[j][i] + " ");
    }
    System.out.println();
}
    }
    }

