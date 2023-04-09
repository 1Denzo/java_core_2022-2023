package LR8.Primer10;

import java.io.*;

import static java.lang.System.out;

public class Buf_RW_2 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = null;
            PrintWriter out=null;
            try {
                br = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("D:\\tmp\\f1.txt"),"UTF-8"));
                out = new PrintWriter("D:\\tmp\\f1.txt", "cp1251");
                int lineCount = 0;
                String s;
                while ((s = br.readLine()) != null) {
                    lineCount++;
                    out.println(lineCount + ": " + s);
                }
            } catch (IOException e) {
                System.out.println("Ошибка !!!!!!!!"); }
            finally{
                br.close();
                out.flush();
                out.close();
            }}}
