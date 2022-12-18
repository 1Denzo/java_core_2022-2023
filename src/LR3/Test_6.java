package LR3;

import java.util.Scanner;

public class Test_6 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner id = new Scanner(System.in);
        int size = id.nextInt();
        System.out.println("Размер массива равен: "+ size);
        int[] array = new int[size];
        int member_interator = 0;
        if (size>=1){
        for (int i = 0; member_interator <= size-1; i++) {
            if (i % 5 == 2) {
                System.out.println(member_interator + " член массива равен " + i + ".");
                array[member_interator] = i;
                member_interator++;
            }
            }
        } else if (size <= 0) {
            System.out.println("Неверный ввод!!!");
        }
        }
    }
