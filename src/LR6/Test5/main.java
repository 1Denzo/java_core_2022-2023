package LR6.Test5;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("Ведите число для нахождения cуммы квадратов слогаемых: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Test5 s = new Test5();
        System.out.println("Сумма квадратов " + num + " равна " + s.sqr(num));
    }
}

