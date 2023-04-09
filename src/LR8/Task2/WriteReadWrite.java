package LR8.Task2;

import java.io.*;
import java.util.Scanner;

public class WriteReadWrite {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in, "UTF-8");
            System.out.print("Введите имя файла => ");
            String fname = sc.nextLine();
            try {
                File f1 = new File("D:\\tmp\\" + fname + ".txt");
                f1.createNewFile(); // файл создан
                System.out.println("Полный путь файла: " + f1.getAbsolutePath());
                int n = 1;
                int j = 5;
                try {
                    DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
                    try (DataOutputStream nOut = new DataOutputStream()) {
                    }
                    for (int i = 0; i <= n; i++) {
                        System.out.print("Введите " + (i + 1) + " строку для записи в файл => ");
                        String s = sc.nextLine();
                        dOut.writeUTF(s );
                        if (i == 1) {
                            dOut.flush();
                            dOut.close();
                            for (int k = 0; k < j; k++) {
                                System.out.print("Введите " + (k + 1) + " число из " + j + " чисел double для записи в файл => ");
                                double dl = sc.nextDouble();
                                dOut.writeDouble(dl);
                            }
                        }
                    }
                    dOut.flush();
                    dOut.close();
                    System.out.println("Файл записан.");
                } catch (IOException e) {
                    System.out.println("" + e);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }}

