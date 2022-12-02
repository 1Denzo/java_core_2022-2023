package LR2;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Ввведите целое число:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = num % 3;
        System.out.println("Остаток деления числа " +num+ " на 3 = " + result + ".");
        if (result == 0) {
            System.out.println("Число " +num+ " делится на 3 без остатка.");
        } else {
            System.out.println("Число " +num+ " не делится на 3 без остатка.");
        }
    }
}
