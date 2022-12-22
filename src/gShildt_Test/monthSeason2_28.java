package gShildt_Test;

import java.util.Scanner;

public class monthSeason2_28 {
    //Усовершенствованная версия программы, в которой
    //определяется принадлежность месяца времени года
    public static void main(String args[]) {
        System.out.print("Введите номер месяца (1-12): ");
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зиме";
                break;
            case 3:
            case 4:
            case 5:
                season = "весне";
                break;
            case 6:
            case 7:
            case 8:
                season = "лету";
                break;
            case 9:
            case 10:
            case 11:
                season = "осени";
                break;
            default:
                season = "вымышленным месяцам";
        }
                System.out.println(month + " месяц относится к " + season + ".");
        }
    }