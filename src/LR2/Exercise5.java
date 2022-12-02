package LR2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Ввведите целое число:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int rezult = num / 1000;
        if (rezult <1){
            System.out.printf("Число " + num + " меньше 1000.");
        } else if (rezult>=1) {
            System.out.println("Введенное вами число содержит " + rezult + " тысяч.");
        }
        }
    }

