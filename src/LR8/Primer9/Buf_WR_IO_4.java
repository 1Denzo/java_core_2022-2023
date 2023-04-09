package LR8.Primer9;

import java.io.*;

import static java.lang.System.out;

public class Buf_WR_IO_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw=null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\tmp\\f1.txt"),"UTF-8"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("D:\\tmp\\f2.txt"),"UTF-8"));
            int lineCount = 0; // счетчик строк
            String s;
            while ((s = br.readLine()) != null) { lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!!!!!");
        }
        finally{
            br.close();
            bw.flush();
            bw.close();
        }
    }}

