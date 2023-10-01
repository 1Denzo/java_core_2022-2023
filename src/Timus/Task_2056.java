package Timus;
/*Вот и подошел к концу первый семестр в университете. Андроид Вася успешно сдал все экзамены и теперь хочет узнать,
 будет ли у него стипендия. В университете следующая политика предоставления стипендии.
Если у студента есть тройки, то стипендия ему не выплачивается.
Если студент сдал сессию на одни пятерки, то он получает именную стипендию.
Если студент не получил именную стипендию, и его средний балл не менее 4.5, то он получает повышенную стипендию.
Если студент не получил ни именную, ни повышенную стипендии, и при этом у него нет троек, то он получает обычную
стипендию.
Помогите Васе определить, будет ли у него стипендия, и если да, то какая.
Исходные данные
В первой строке записано целое число n — количество экзаменов (1 ≤ n ≤ 10). В i-й из следующих n строк
 записано целое число mi — оценка, полученная Васей на i-м экзамене (3 ≤ mi ≤ 5).
Результат
Если у Васи не будет стипендии, выведите «None». Если у него будет обычная стипендия, выведите «Common»,
 если повышенная — «High», если именнная — «Named».*/

import java.io.PrintWriter;
import java.util.Scanner;

public class Task_2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int exam = in.nextInt();
        int sum = 0;
        boolean s = false;
        int[] examScore = new int[exam];
        for (int i = 0; i < exam; i++) {
            examScore[i] = in.nextInt();
            sum = sum + examScore[i];
            if (examScore[i] == 3 && !s) {
                out.println("None");
                s = true;
            }
            }
        in.close();
        if (sum == exam * 5) {
            out.println("Named");

        } else if (sum >= exam * 4.5 && !s) {
            out.println("High");
        } else if (!s) {
            out.println("Common");
        }
        out.flush();
    }
}

