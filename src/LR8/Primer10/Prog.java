package LR8.Primer10;

import java.io.*;

import static java.lang.System.out;

public class Prog {
    public static void main(String[] args) {
        try {
            BufferedReader br = null;
            PrintWriter pw = null;
            try {
                br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\temp\\f1.txt"), "cp1251"));
                pw = new PrintWriter("C:\\temp\\f2.txt", "cp1251");
                int lineCount = 0;
                String line;
                while ((line = br.readLine()) != null) {
                    lineCount++;
                    out.printf("%d: %s\n", lineCount, line);
                }
                pw.flush();
            } finally {
                br.close();
                pw.close();
            }
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }
}
