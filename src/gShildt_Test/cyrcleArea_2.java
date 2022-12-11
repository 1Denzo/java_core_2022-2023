package gShildt_Test;

import java.util.Scanner;

public class cyrcleArea_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Для рассчета площади круга, введите радиус, для обозначение дробной части используйте ,: "); // Вводим радиус
        double r = in.nextDouble();
        double pi,a;
        pi = 3.141592; // Приблизительное значение pi
        a = pi * r * r; //Вычисление площади круга
        System.out.println("Площадь круга равна " + a + " ");
            }
}
