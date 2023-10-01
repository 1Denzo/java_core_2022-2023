package Timus;
/*Мюллер много раз пытался поймать Штирлица с поличным, но тот всё время выкручивался. Как-то раз Штирлиц
 просматривал электронную почту. В это время незаметно вошел Мюллер и увидел, как у него на экране появился
 бессмысленный набор символов. «Шифровка», — подумал Мюллер. «UTF-8», — подумал Штирлиц.
Известно, что Штирлиц шифрует текст следующим образом:
Убирает все пробелы и знаки препинания.
Заменяет все подряд идущие одинаковые буквы на одну такую букву.
Многократно вставляет в произвольное место текста две одинаковых буквы.
Попробуйте восстановить текст, каким он был после второго шага. Для этого удалите из текста все пары одинаковых
 символов, добавленные на третьем шаге.
Исходные данные
В единственной строке записана шифровка Штирлица, состоящая из строчных латинских букв. Длина шифровки
 не превосходит 200000.
Результат
Выведите восстановленный текст.
Пример
исходные данные	результат
wwstdaadierfflitzzz
stierlitz*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class Task_1654 {
        static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        static PrintWriter out = new PrintWriter(System.out);

        public static void main(String str[]) throws IOException {
            Locale.setDefault(Locale.US);

            String shifr = buffer.readLine();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < shifr.length(); i++) {
                char current = shifr.charAt(i);

                if (result.length() > 0 && result.charAt(result.length() - 1) == current) {
                    result.deleteCharAt(result.length() - 1);
                } else {
                    result.append(current);
                }

            }
            out.println(result);
            out.flush();
        }
    }

