package LR11.Part1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        System.out.println("Введите размер одномерного массива чисел: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] integers = new int[size];
        int[] ints = addElement(integers, size);
        recursionPrint(ints, size);
        //System.out.println("Введен массив: " + integers.toString());
    }
    static int[] addElement (int[] integers, int size){
            if (size == 0) return integers;
        else {
            System.out.println("Введите  элемент " + size + " массива: ");
            Scanner in = new Scanner(System.in);
            integers[size - 1] = in.nextInt();
        } return addElement(integers, size-1);
    }
    static int recursionPrint(int[] ints, int size) {
        if (size == 0) {
            System.out.println("Конец массива.");
            return 0;
        }
            System.out.println(ints[size - 1]);
            return recursionPrint(ints, size - 1);
        }
    // рекурсия - сумма элементов массива
    static int Sum(int i, int[] A) {
        if (i==(A.length-1))
            return A[i];
        return A[i] + Sum(i+1,A);
    }
}