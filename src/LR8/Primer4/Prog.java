package LR8.Primer4;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Prog {
    public static void main(String[] args) throws Exception {
        try {
            var f1 = new File("C:\\temp\\numIsh.txt");
            f1.createNewFile();
            var scan = new Scanner(in, "UTF-8");
            out.print("Сколько вещественных чисел записать в файл?: ");
            int count = scan.nextInt();
            float[] arr = new float[count];
            out.print("Введите числа: ");
            for (int i = 0; i < count; i++)
                arr[i] = scan.nextFloat();
            FSWork.writeFloatsToFile(f1.getAbsolutePath(), arr);

            var f2 = new File("C:\\temp\\numRez.txt");
            f2.createNewFile();
            FSWork.copyFile(f1.getAbsolutePath(), f2.getAbsolutePath());
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }
}


