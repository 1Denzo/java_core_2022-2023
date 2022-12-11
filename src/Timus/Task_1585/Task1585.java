package Timus.Task_1585;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1585  {
        public static void main(String[] args) {
            String inputFileName = "src/Timus/Task_1585/input.txt";
            boolean oj = System.getProperty("ONLINE_JUDGE") != null;
            int n = 0;
            try {
                BufferedReader bueferedReader =
                        oj ? new BufferedReader(new InputStreamReader(System.in)) :
                                new BufferedReader(new FileReader(inputFileName));
                String readLine = "";
                int num = 0;
                int emp = 0;
                int lit = 0;
                int mac = 0;
                while ((readLine = bueferedReader.readLine()) != null) {
                    if (num == 0) {
                        num = Integer.parseInt(readLine);
                        continue;
                    }
                    if (readLine.contains("Emperor Penguin")) {
                        emp++;
                    }
                    if (readLine.contains("Little Penguin")) {
                        lit++;
                    }
                    if (readLine.contains("Macaroni Penguin")) {
                        mac++;
                    }
                }
                if (emp >= lit) {
                    if (emp >= mac) {
                        System.out.println("Emperor Penguin");
                    } else if (emp <= mac) {
                        System.out.println("Macaroni Penguin");
                    }
                } else if (emp <= lit) {
                    if (lit > mac) {
                        System.out.println("Little Penguin");
                    } else if (lit <= mac) {
                        System.out.println("Macaroni Penguin");
                    }
                }
            }catch (IOException exeption) {
                exeption.printStackTrace();
            }
        }
    }

