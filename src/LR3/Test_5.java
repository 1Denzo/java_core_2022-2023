package LR3;

import java.util.Scanner;

public class Test_5 {
    public static void main(String[] args) {
        System.out.println("Программа вычисляет сумму чисел,удовлетворяющих таким критериям:\n" + " при делении числа на 5 в остатке получатся 2, или при делении на 3 в остатке получается 1");
        System.out.println("Ведите количество чисел в сумме: ");
        Scanner in = new Scanner(System.in);
        int numberOfMember = in.nextInt();
        int sum_interator = 0;
        int sum = 0;
        for (int i = 1; sum_interator <= numberOfMember; i++) {
            if (i % 5 == 2) {
                System.out.println(i);
                sum = sum + i;
                sum_interator++;
            }
                else if (i % 3 == 1) {
                    System.out.println(i);
                    sum = sum + i;
                    sum_interator++;
                }
            }
        System.out.println("Сумма чисел последовательности: " + sum);
    }
}

