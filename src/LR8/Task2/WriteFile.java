package LR8.Task2;

import java.io.*;
import java.util.Scanner;


public class WriteFile {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in, "UTF-8");
            System.out.print("������� ��� ����� => ");
            String fname = sc.nextLine();
            try {
                File f1 = new File("D:\\tmp\\" + fname + ".txt");
                f1.createNewFile(); // ���� ������
                System.out.println("���� ������. ������ ���� �����: " + f1.getAbsolutePath());
                int n = 1;
                int j = 5;
                    BufferedWriter dOut = new BufferedWriter(new FileWriter(f1.getAbsolutePath()));
                    for (int i = 0; i <= n; i++) {
                        System.out.print("������� " + (i + 1) + " ������ ��� ������ � ���� => ");
                        String s = sc.nextLine();
                        dOut.write(s + "\n");
                        if (i == 1) {
                            for (int k = 0; k < j; k++) {
                                System.out.print("������� " + (k + 1) + " ����� �� " + j + " ����� double ��� ������ � ���� => ");
                                Double dl = sc.nextDouble();
                                dOut.write(dl.toString() + "\n");
                            }
                        }
                    }
                    dOut.flush();
                    dOut.close();
                    System.out.println("���� �������.");
                } catch (IOException e) {
                    System.out.println("" + e);
                }
            }
            }


