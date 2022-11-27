package LR1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Input your name: ");
    String name = in.nextLine();
System.out.println("Input your year of birth: ");
    int age = in.nextInt();
    age = 2022 - age;

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    in.close();
}
}
