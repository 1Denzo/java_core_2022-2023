package LR8.Task2;

import java.io.*;
public class fdshy {

        public static void main(String[] args) throws IOException {
            BufferedReader br = null;
            PrintWriter out=null;
            try {
                String letters = "бБвВгГдДжЖзЗйЙкКлЛмМнНпПрРсСтТфФхХцЦчЧшШщЩ";
                br = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("D:\\tmp\\tolstoy.txt")));
                File f1 = new File("D:\\tmp\\tolstoy2.txt");
                f1.createNewFile();
                out = new PrintWriter("D:\\tmp\\tolstoy2.txt");
                String stroka;
                int counterLine = 0;
                int counter = 0;
                while ((stroka = br.readLine()) != null) {
                    counter = 0;
                    out.print("Строка " + counterLine + ": ");
                    System.out.print("Строка " + counterLine + ": ");
                    if (stroka.length() != 0) {
                        for (String word : stroka.split(" ")) {
                            if (letters.contains(word.substring(0, 1))){
                                out.print(word + " ");
                                System.out.print(word + " ");
                                counter++;
                            }

                        }
                    }
                    out.print(" Кол-во слов - " + counter);
                    System.out.print("Кол-во слов - " + counter + "\n");
                    counterLine++;
                    out.println();
                }
            } catch (IOException e) {
                System.out.println("ошибка" + e); }
            finally{
                br.close();
                out.flush();
                out.close();
            }
        }
    }

