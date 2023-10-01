package Timus;
/*Грядут очередные выборы. Снова все заборы оклеены листовками, почтовые ящики забиты макулатурой, с экранов
 телевизоров на нас взирают мордатые дядьки, обещающие сделать нашу жизнь лучше… А программист Васечкин снова
  завален работой. Необходимо написать программу, которая облегчит подсчет голосов избирателей.
Исходные данные
Первая строка содержит целые числа N — число кандидатов (1 ≤ N ≤ 10000) и M — число избирателей, принявших
участие в выборах (1 ≤ M ≤ 10000). Далее следуют M строк, в каждой из которых находится номер кандидата,
за которого проголосовал избиратель. Кандидаты пронумерованы целыми числами от 1 до N.
Результат
Выведите N строк, в i-й строке должен быть указан процент избирателей, проголосовавших за i-го кандидата
 (с точностью до двух знаков после десятичной точки).*/
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Task_1263 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            PrintWriter out = new PrintWriter(System.out);
            String[] parts = input.split("\\s+");
            int N = Integer.parseInt(parts[0]);
            int M = Integer.parseInt(parts[1]);
            int[] votes = new int[N];
            for (int i = 0; i < M; i++) {
                int candidate = scanner.nextInt();
                votes[candidate - 1]++;
            }
            for (int k = 0; k < N; k++) {
                double percent = (double) votes[k] / M * 100;
                String formattedDouble = new DecimalFormat("#0.00").format(percent);
                out.println(formattedDouble + "%");
                out.flush();
            }
        }
    }

