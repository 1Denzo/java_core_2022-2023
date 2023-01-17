package LR8.Primer3;

import java.io.FileInputStream;
import java.io.InputStream;

import static java.lang.System.out;

public class Prog {
    public static void main(String[] args) {
        try {
            var fileName = "C:\\temp\\text.txt";
            InputStream inFile = null;
            try {
                inFile = new FileInputStream("C:\\temp\\text.txt");
                Reader.readAllByByteToConsole(inFile);
            } finally {
                if (inFile != null) inFile.close();
            }
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }
}
