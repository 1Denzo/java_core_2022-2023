package Timus;
/*Пока Федя писал условие для задачи «Летопись GOV», ему пришло в голову, что бумаги для печати условий может
 не хватить. А тут ещё оказалось, что в его текстовом редакторе нет возможности определить количество страниц
  в тексте. Однако Федя не растерялся и решил сам написать программу, рассчитывающую количество страниц по
   введённому тексту.
Он знал, что на каждой странице h строк, а в каждой строке w символов. Между каждой парой соседних слов
в одной строке ставится ровно один пробел. Если слово не помещается в строку, Федя не делит его на слоги
для переноса и не ставит пробел, а просто пишет всё слово с начала новой строки.
Исходные данные
В первой строке записаны целые числа h, w, n — количество строк на странице, символов в строке и слов
 в тексте задачи, соответственно (1 ≤ h, w ≤ 100; 1 ≤ n ≤ 10 000). В следующих n строках записан текст
 условия, которое написал Федя, по одному слову в строке. Слова в условии непусты, имеют длину не более
 w и состоят только из строчных и заглавных латинских букв и знаков препинания (точка, запятая,
  восклицательный и вопросительный знаки). Суммарная длина всех слов не превосходит 10 000.
Результат
Выведите количество страниц в тексте условия задачи.
Пример
исходные данные	результат
3 5 6
To
be
or
not
to
be
2
*/

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_1881 {
    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] str) {
        Locale.setDefault(Locale.US);

        final int h = input.nextInt();
        final int w = input.nextInt();
        final int n = input.nextInt();

        int[] words = new int[n];
        for (int i = 0; i < n; i++) {
            words[i] = input.next().length();
        }
        int lineCounter = 1;
        int totalLL = -1;
        for (int i = 0; i < n; i++) {
            totalLL = totalLL + words[i] + 1;
            if (totalLL > w) {
                lineCounter++;
                totalLL = words[i];
            }
        }
        int result = lineCounter / h;
        if ((lineCounter % h) > 0) {
            result++;
        }
        out.println(result);
        out.flush();
    }
}
