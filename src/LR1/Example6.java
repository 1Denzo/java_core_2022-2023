package LR1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Напишите свою фамилию : ");
        String surname = in.nextLine();

        System.out.println("Напишите свое имя: ");
        String name = in.nextLine();

        System.out.println("Напишите свое отчество: ");
        String fathername = in.nextLine();

        System.out.println("Привет: " + surname + " " + name + " " + fathername);
        in.close();
    }
}
