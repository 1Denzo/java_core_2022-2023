package LR9.Task2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/* Программа, где требуется из матрицы вывести столбец с номером, заданным с клавиатуры, обрабатываются ошибки в следующих случаях:
–	ввод строки вместо числа;
–	нет столбца с таким номером
*/
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Введите размерность двухмерного массива x*x, целое положительное число x: ");
        int x = 0;
        int [][] arr = null; //Инициализация массива
        Scanner in = new Scanner(System.in);
        try {
            x = in.nextInt();
        }
        catch (InputMismatchException e) { //Обработка ошибки ввода размера массива
            System.out.println("Введено слишком большое число, введен знак или символ");
            System.exit(1);
        }
        try {
            arr = new int[x][x];
        }
        catch (NegativeArraySizeException e) { //Обработка ошибки ввода размера массива, отрицательный размер массива
            System.out.println("Отрицательный размер массива!!!");
            System.exit(1);
        }
        Random random = new Random();
        System.out.println("Вывожу созданную матрицу размером " + x + "*" + x + ":");
        for (int i = 0; i < x; i++) { //Заполнение массива в цикле случайными числами
            System.out.println();
            for (int k = 0; k < x; k++) {
               arr[i][k] = random.nextInt(200);
               System.out.print(" " + arr[i][k]);
            }}
        System.out.println();
        System.out.println("Введите номер столбца для вывода в виде строки: ");
        int num = 0;
        try {
            num = in.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Введено слишком большое число, введен знак или символ");
            System.exit(1);
        }
        try {
            for (int l = 0; l < x; l++) System.out.print(arr[num][l] + " ");
        }
            catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Номер стобца выходит за размер массива, x!!!");
            System.exit(1);
        }
        }}
