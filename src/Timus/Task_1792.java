package Timus;
/*Рассмотрим четыре круга, пересекающиеся так, как показано на рисунке. Назовём лепестком каждую из трёх фигур,
 образованных пересечением трёх кругов.Запишем в каждом из кругов ноль или единицу. После этого в каждом лепестке
  запишем остаток при делении на два суммы чисел во всех кругах, в которых содержится этот лепесток. Например,
  если в кругах были записаны числаb0, 1, 0, 1, то в лепестках будут записаны числа 0, 1, 0
  (круги и лепестки перечислены в порядке, указанномbна рисунке).Описанная схема называется кодом Хэмминга и обладает интересным свойством. Если ваш враг в тайне от вас изменит любое из семи записанных по этой схеме чисел, вы сможете однозначно определить, какое число он изменил. Решив эту задачу, вы узнаете, как это сделать.
Problem illustration
Исходные данные
В единственной строке через пробел записаны семь чисел. Каждое из чисел равно нулю или единице. Сперва идут четыре числа, записанные в кругах в порядке, указанном на рисунке. Далее идут три числа, записанные в лепестках в порядке, указанном на рисунке.
Результат
В единственной строке выведите через пробел семь чисел, образующие код Хэмминга. Набор чисел должен отличаться от исходного не более чем в одном числе. Гарантируется, что любой набор входных данных либо сам является кодом Хэмминга, либо в нём можно изменить в точности одну цифру и получить код Хэмминга.
Примеры
исходные данные	результат
0 1 0 1 1 0 1
0 1 0 0 1 0 1
1 1 1 1 1 1 1
1 1 1 1 1 1 1
*/

import java.io.*;
import java.util.Locale;

public class Task_1792 {
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    public static int nextInt() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    public static void main(String[] str) throws IOException {
        Locale.setDefault(Locale.US);

        final int n = 7;
        int[] hem = new int[n];
        for (int i = 0; i < n; i++) {
            hem[i] = nextInt();
        }

        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        if (!(((hem[1] + hem[2] + hem[3]) % 2) == hem[4])) {
            flag1 = true;
        }

        if (!(((hem[0] + hem[2] + hem[3]) % 2) == hem[5])) {
            flag2 = true;
        }

        if (!(((hem[0] + hem[1] + hem[3]) % 2) == hem[6])) {
            flag3 = true;
        }


        if (flag1 && flag2 && flag3) {
            hem[3] = (hem[3] + 1) % 2;
        } else if (flag1 && flag2) {
            hem[2] = (hem[2] + 1) % 2;
        } else if (flag2 && flag3) {
            hem[0] = (hem[0] + 1) % 2;
        } else if (flag1 && flag3) {
            hem[1] = (hem[1] + 1) % 2;
        } else if (flag1) {
            hem[4] = (hem[4] + 1) % 2;
        } else if (flag2) {
            hem[5] = (hem[5] + 1) % 2;
        } else if (flag3) {
            hem[6] = (hem[6] + 1) % 2;
        }

        for (int i = 0; i < n; i++) {
            out.print(hem[i]);
            out.print(" ");
        }
        out.flush();
    }
}
