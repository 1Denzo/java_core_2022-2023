package LR6.Test6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("Ведите размер массива: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Введите число-ограничитель массива: ");
        Scanner in2 = new Scanner(System.in);
        int num2 = in.nextInt();
        int[] arrayInt = new  int[num];
        for (int i = 0; i < arrayInt.length; i++) {
            Random random = new Random();
            arrayInt[i] = random.nextInt(50);
        }
        int[] arrayResult = main.convertArray(arrayInt, num2);
        System.out.println(Arrays.toString(arrayResult));
    }
public static int[] convertArray(int[] arrayInt, int num2){
    if (num2 >= arrayInt.length) {
        return arrayInt;
    }
    int[] arrayResult = new int[num2];
    for (int i = 0; i < num2; i++) {
        arrayResult[i] = arrayInt[i];
    }
return arrayResult;
}
}