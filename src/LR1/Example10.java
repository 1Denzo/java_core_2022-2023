package LR1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Input your year of birth: ");
    int age = in.nextInt();

    age = 2022 - age;

    System.out.println("Your age: " + age);
        in.close();
}
}
