package LR13;

import java.util.Scanner;

/*Напишите функцию, которая находит максимальный элемент в массиве целых чисел при помощи многопоточности.
 Количество потоков должно быть равно количеству ядер процессора.*/
public class Exercise5 {
    private static final int TAG_Core = 6;
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int threadQuotitu = size / TAG_Core;
        for (int i = 1; i <= TAG_Core; i++){
            Thread thread = new NumThread(i);
            thread.start();
            thread.join();
        }
    }
}
class NumThread extends Thread {
    private int number;
    public NumThread(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Поток " + number + " выполняется.");
    }
}
    public static int[] Array = {5, 8, 34, 48, 2};
    static public void Method1() // здесь вводится массив с данными
    {
        int sum = 0;
        Max = Array[0];
        Min = Array[0];
        for (int j : Array) {
            sum += j;
            if (j > Max) Max = j;
            if (j < Min) Min = j;
}
