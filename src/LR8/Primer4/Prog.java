package LR8.Primer4;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;
/* Программу Primer4 составить в соответствии со следующим алгоритмом:
1. Создать новую папку My на диске.
2. В папке создать 1-й файл numIsh.txt.
3. В файл записать через поток числа, вводимые с клавиатуры.
4. В той же папке создать 2-й файл numRez.txt.
5.1 Открыть 1-й поток для чтения из 1-го файла numIsh.txt;
5.2 Открыть 2-й поток для записи во 2-й файл numRez.txt;
5.3 Пока не конец 1-го файла:
а) Считать число из 1-го потока (файла numIsh.txt);
б) Записать число во 2-й поток (файл numRez.txt);
в) Вывести число на экран;
5.4 Дописать остаток данных на диск; 5.5)
закрыть 1-й поток;
5.6 Закрыть 2-й поток.
6. Закончить.
*/

public class Primer4 {
    public static void main(String[] args) {
        try {
            //Создание исходного файла numIsh.txt и записать в него число типа float
            File f1 = new File("D:\\My\\numIsh.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));

        }
    }
}

