package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int garry_Hit = in.nextInt();
        int larry_Hit = in.nextInt();
        int cans = garry_Hit + larry_Hit - 1;
        int garry_Missed = cans - garry_Hit;
        int larry_Missed = cans - larry_Hit;
        out.println(garry_Missed + " " + larry_Missed);
        out.flush();
    }
}
