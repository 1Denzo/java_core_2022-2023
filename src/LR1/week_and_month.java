package LR1;

import java.util.Scanner;

public class week_and_month {
    public static void main(String[] args) {
        byte day_Number = 0;
        int month_Number = 0;

        System.out.println("Input day of the week: ");

        Scanner in = new Scanner(System.in);

               String day = in.nextLine();

        switch (day) {
            case "monday":
                day_Number = 1;
                break;
            case "tuesday":
                day_Number = 2;
                break;
            case "wednesday":
                day_Number = 3;
                break;
            case "thursday":
                day_Number = 4;
                break;
            case "friday":
                day_Number = 5;
                break;
            case "saturday":
                day_Number = 6;
                break;
            case "sunday":
                day_Number = 7;
                break;
            default:
                System.out.print("Неправильное название дня недели!!!\n");
                break;
        }
        System.out.println("Input name of month: ");
        String month = in.nextLine();
        switch (month) {
            case "jenuary":
                month_Number = 1;
                break;
            case "february":
                month_Number = 2;
                break;
            case "march":
                month_Number = 3;
                break;
            case "april":
                month_Number = 4;
                break;
            case "may":
                month_Number = 5;
                break;
            case "june":
                month_Number = 6;
                break;
            case "july":
                month_Number = 7;
                break;
            case "august":
                month_Number = 8;
                break;
            case "september":
                month_Number = 9;
                break;
            case "oktober":
                month_Number = 10;
                break;
            case "november":
                month_Number = 11;
                break;
            case "december":
                month_Number = 12;
                break;
            default:
                System.out.print("Неправильное название месяца!!!\n");
                break;
        }
        System.out.println("Input day number in month: ");
        byte number = in.nextByte();

        System.out.println("Day of week: " + day_Number);
        System.out.println("Day of month: " + number);
        System.out.println("Date: " + number + "." + month_Number + ".2022");
        in.close();
    }
}