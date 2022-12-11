package LR3;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {

            System.out.println("Input number day of the week(1-7): ");

            Scanner in = new Scanner(System.in);
int day_Number = in.nextInt();
String day;
switch (day_Number) {
    case 1:
        day = "monday";
        System.out.println(day);
        break;
        case 2:
            day = "tuesday";
            System.out.println(day);
            break;
            case 3:
                day = "wednesday";
                System.out.println(day);
                break;
    case 4:
                    day = "thursday";
                    System.out.println(day);
                    break;
    case 5:
                        day = "friday";
                        System.out.println(day);
                        break;
    case 6:
                        day = "saturday";
                        System.out.println(day);
                        break;
    case 7:
                        day = "sunday";
                        System.out.println(day);
                        break;
                default:
                    System.out.println("Число введено неправильно!!!");
            }
    }
}
