package LR3;

import java.util.Scanner;

public class Test_2 {
         public static void main(String[] args) {
            byte day_Number = 0;

            System.out.println("Введите название дня недели: ");

            Scanner in = new Scanner(System.in);

            String day = in.nextLine();

           switch (day) {
               case "понедельник":
                day_Number = 1;
                break;
               case "вторник":
                   day_Number = 2;
                   break;
               case "среда":
                   day_Number = 3;
                   break;
               case "четверг":
                   day_Number = 4;
                   break;
               case "пятница":
                   day_Number = 5;
                   break;
               case "суббота":
                   day_Number = 6;
                   break;
               case "воскресенье":
                   day_Number = 7;
                   break;
               default:
                   System.out.printf("Неправильное название дня недели!!!\n");
                   break;
            }
             System.out.println("Номер дня недели: " +day_Number);
            }
    }
