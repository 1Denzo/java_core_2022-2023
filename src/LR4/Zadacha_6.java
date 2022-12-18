package LR4;

import java.util.Random;
import java.util.Scanner;

public class Zadacha_6 {
    public static void main(String[] args) {
        System.out.println("Введите количество строк матрицы:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Введитите количество столбцов матрицы:");
        Scanner in2 = new Scanner(System.in);
        int y = in.nextInt();
        int num[][] = new int[x][y];
        int num1[][] = new int[x - 1][y - 1];
        int i, j, s, n;
        Random random = new Random();
        int delS = random.nextInt(x-1);                                  //генерация № строки для удаления
        int delK = random.nextInt(y-1);                                  //генерация № столбца для удаления
        for (i = 0; i < num.length; i++) {
            for (j = 0; j < num.length; j++) {
                num[i][j] = random.nextInt(100);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("delS = "+(delS)+"; delK= "+(delK));
                for (i = 0, s = 0; i < num1.length; s++, i++) {
            if (s != delS) {
                for (j = 0, n = 0; j < num1.length; n++, j++) {
                    if (n != delK) {
                        num1[i][j] = num[i][j];
                        System.out.print(num1[i][j] + " ");
                    }
                }
            }
                    System.out.println();
        }
    }
}