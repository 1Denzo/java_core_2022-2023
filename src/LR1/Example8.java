package LR1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        byte day_Number = 0;
        int month_Number = 0;

        System.out.println("Input day of the week: ");

        Scanner in = new Scanner(System.in);

               String day = in.nextLine();

if (day.equals("monday")) {
    day_Number = 1;
    }
    else if (day.equals("tuesday")) {
    day_Number = 2;
    }
    else if (day.equals("wednesday")) {
    day_Number = 3;
    }
    else if (day.equals("thursday")) {
    day_Number = 4;
    }
    else if (day.equals("friday")) {
        day_Number = 5;
    }
    else if (day.equals("saturday")) {
    day_Number = 6;
    }
    else if (day.equals("sunday")) {
    day_Number = 7;
    }
    else {
    System.out.printf("Неправильное название дня недели!!!\n");
}
        System.out.println("Input name of month: ");
        String month = in.nextLine();
        if (month.equals("jenuary")){
            month_Number  = 1;
        }
        else if (month.equals("february")) {
            month_Number = 2;
        }
        else if (month.equals("march")) {
            month_Number = 3;
        }
        else if (month.equals("april")) {
            month_Number = 4;
        }
        else if (month.equals("may")) {
            month_Number = 5;
        }
        else if (month.equals("june")) {
            month_Number = 6;
        }
        else if (month.equals("july")) {
            month_Number = 7;
        }
        else if (month.equals("august")) {
            month_Number = 8;
        }else if (month.equals("september")) {
            month_Number = 9;
        }else if (month.equals("oktober")) {
            month_Number = 10;
        }else if (month.equals("november")) {
            month_Number = 11;
        }else if (month.equals("december")) {
            month_Number = 12;
        }
        else {
            System.out.printf("Неправильное название месяца!!!\n");
        }
        System.out.println("Input day number in month: ");
        byte number = in.nextByte();

        System.out.println("Day of week: " + day_Number);
        System.out.println("Day of month: " + number);
        System.out.println("Date: " + number + "." + month_Number + ".2022");
        in.close();
    }
}