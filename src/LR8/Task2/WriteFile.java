package LR8.Task2;

import java.io.*;
import java.util.Scanner;

public class WriteFile {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in, "UTF-8");
            System.out.print("Введите имя файла => ");
            String fname = sc.nextLine();
            try {
                File fw = new File( "D:\\tmp\\" + fname + ".txt");
                 fw.createNewFile(); // файл создан
                System.out.println("Путь к файлу: " + fw.getAbsolutePath());
                int n = 1;
                int j = 5;
                BufferedWriter dOut = new BufferedWriter(new FileWriter(fw));
                for (int i = 0; i <= n; i++) {
                    System.out.print("Введите " + (i + 1) + " строку для записи в файл => ");
                    String s = sc.nextLine();
                    dOut.write(s + "\n");
                    if (i == 1) {
                        for (int k = 0; k < j; k++) {
                            System.out.print("Введите " + (k + 1) + " число из " + j + " чисел double для записи в файл => ");
                            Double dl = sc.nextDouble();
                            dOut.write(dl.toString() + "\n");                        }
                    }
                }
                dOut.flush();
                dOut.close();
                System.out.println("Файл записан.");
            } catch (IOException e) {
                System.out.println("" + e);
            }
        }}

