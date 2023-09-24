package LR12;

import java.util.*;

/*10.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
 содержащий только те числа, которые меньше заданного значения.*/
public class Example10 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
    int size = in.nextInt();
        int [] nums = new int [size];
        System.out.println("Введите число, отсекающее массив снизу (числа больше которого останутся в массиве): ");
    int minValue = in.nextInt();
    Random random = new Random();
        for (int i = 0; i < size; i++) {
            nums[i] = random.nextInt(size);
    }
        int [] result = filterNumbers(nums, minValue);
        System.out.println("список, содержащий только те числа, которые больше заданного ");
        for (int res : result) {
            System.out.print(" " + res);
        }
}
    public static int[] filterNumbers(int[] nums, int minValue) {
        return Arrays.stream(nums).filter( x -> x > minValue).toArray();
    }
}

