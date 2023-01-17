package LR8.Primer7;

import java.io.*;

import static java.lang.System.out;

public class Prog {
    public static void main(String[] args) {
        try {
            BufferedReader reader = null;
            BufferedWriter writer = null;
            try {
                reader = new BufferedReader(new FileReader("C:\\temp\\f1.txt"), 1024);
                writer = new BufferedWriter(new FileWriter("C:\\temp\\f2.txt"));
                int lineCount = 0;
                String line = "";
                while ((line = reader.readLine()) != null) {
                    lineCount++;
                    out.printf("$d: $s\n", lineCount, line);
                    writer.write(line);
                    writer.newLine();
                }
                writer.flush();
            } finally {
                reader.close();
                writer.close();
            }
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }
}
