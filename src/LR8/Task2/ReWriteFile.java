package LR8.Task2;

import java.io.*;
import static java.lang.System.out;

public class ReWriteFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out=null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\Users\\reus\\IdeaProjects\\java_core_2022-2023\\src\\LR8\\Task2\\GoGo.txt"),"UTF-8"));
            out = new PrintWriter("C:\\Users\\reus\\IdeaProjects\\java_core_2022-2023\\src\\LR8\\Task2\\GoGo2.txt", "cp1251");
            int lineCount = 0;
            String s;
            double num;
            while ((s = br.readLine()) != null) {
                lineCount++;
                if (lineCount == 2) {
                    out.println(lineCount + ": " + s);
                }
                if (lineCount > 2) {
                    num = Double.parseDouble(s);
                    if (num > 0) {
                        out.println(lineCount + ": " + s);
                    }}}
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!"); }
        finally{
            br.close();
            out.flush();
            out.close();
        }}}