package LR9.Task2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex3 {
        public static void main(String[] args) {
            Scanner id = new Scanner(System.in);
            System.out.println("Введите количество чисел в массиве: ");
            int size = 0;
            try {
                size = id.nextByte();
            }
            catch (InputMismatchException e) {
                System.out.println("Введено слишком большое число, введен знак или символ");
                System.exit(1);
            }
            byte sum = 0;
            int[] nums = new int[0];
            try {
                nums = new int[size];
            }
            catch (NegativeArraySizeException e) { //Обработка ошибки ввода размера массива, отрицательный размер массива
        System.out.println("Отрицательный размер массива!!!");
        System.exit(1);
            }
            for (int i = 0 ; i < nums.length ; i++ ) {
                System.out.println("Введите число " + (i+1) + " : ");
                byte a = 0;
                try {
                    a = id.nextByte();
                }
                catch (InputMismatchException e) {
                    System.out.println("Введено слишком большое число, введен знак или символ");
                    System.exit(1);
                }
                    catch (NegativeArraySizeException e) { //Обработка ошибки ввода размера массива, отрицательный размер массива
                        System.out.println("Отрицательный размер массива!!!");
                        System.exit(1);
                }
                nums[i] = a;
                sum = (byte) (sum+a);
            }
            System.out.println("Сумма чисел массива " + sum);
            try {
                sum = (byte) (sum/nums.length);
            } catch (ArithmeticException e) {
                System.out.println("Длинна массива не должна быть отрицательна или = 0 ");
                System.exit(1);
            }
            System.out.println("Среднее арифметическое " + sum);
        }}
