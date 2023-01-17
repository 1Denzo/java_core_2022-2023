package LR8.Primer5;

import java.io.File;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Prog {
    public static void main(String[] args) {
        try {
            var scan = new Scanner(in);
            out.print("Введите имя файла: ");
            var fileName = scan.nextLine();
            var f1 = new File(fileName);
            out.printf("Полный путь файла: %s\n", f1.getAbsolutePath());
            out.print("Введите количество строк для записи в файл: ");
            int count = scan.nextInt();
            var lines = new String[count];
            scan.nextLine();
            for (int i = 0; i < count; i++) {
                out.println("Введите строку для записи в файл: ");
                lines[i] = scan.nextLine();
            }
            FSWork.writeStringsToFile(f1.getAbsolutePath(), lines);
            out.println("Запись прошла успешно!\n" +
                    "Записанные данные: \n");
            FSWork.printFilesData(f1.getAbsolutePath());
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }
}
