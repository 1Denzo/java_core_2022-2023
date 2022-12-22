package gShildt_Test;

import java.util.Scanner;

public class monthSeason_26 {
    //Продемонстрировать применение конструкции if-else-if
    public static void main(String args[]) {
        System.out.print("Введите номер месяца (1-12): ");
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "зиме";
        else if (month == 3 || month == 4 || month == 5)
            season = "весне";
        else if (month == 6 || month == 7 || month == 8)
            season = "лету";
        else if (month == 9 || month == 10 || month == 11)
            season = "осени";
        else
            season = "вымышленным месяцам";
        System.out.println(month + " месяц относится к " + season + ".");
    }
}