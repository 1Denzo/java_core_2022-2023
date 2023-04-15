package LR8.Primer4;

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

import java.io.*;
import java.nio.channels.ScatteringByteChannel;
import java.util.Date;
import java.util.Scanner;

public class Primer4 {
    public static void main(String[] args) {
try {
    // Создание исходного файла numIsh.txt и запись в него чисел типа float

    Scanner sc = new Scanner(System.in);
    System.out.println("Сколько вещественных чисел записать в файл?");
    int count = sc.nextInt();



    File f1 = new File("D:\\tmp\\numIs.txt");
    f1.createNewFile();
    DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));

    System.out.println("Введите числа:");
    for (int i = 0; i < count; i++) {
        wr.writeFloat(sc.nextFloat());
    }
        wr.flush();
        wr.close();

        // Создание файла numRez.txt и переписывание в него чисел из numIsh.txt
File f2 = new File("D:\\tmp\\numRez.txt");
f2.createNewFile();

// Поток для чтения из исходного файла nimIsh.txt
    DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
    // Поток в результирующий файл numRez.txt
    wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
    try {
        while (true) {
                float number = rd.readFloat();
                wr.writeFloat(number);
                System.out.println("Число " + (float) number);
            }
        } catch(EOFException e){
        }
        wr.flush();
        wr.close();
        rd.close();
    }catch (IOException e){
        System.out.println("End of file");
    }
}}

