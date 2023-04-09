package LR8.Primer6;

import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;
/* Чтение из одного файла и запись в другой файл данных посимвольно*/
public class File_RW_byByte {
    public static void main(String[] args) throws IOException {
        try {
            Reader Reader = null;
            Writer Writer = null;
            try {
                Reader = new FileReader("D:\\temp\\f1.txt");
                Writer = new FileWriter("D:\\temp\\f2.txt", true);
                int oneByte;
                while ((oneByte = in.read()) != -1) {
                    var ch = (char)oneByte;
                    out.write(ch);
                    out.append(ch);
                    out.print(ch);
                }
            } finally {
                in.close();
                out.close();
            }
        } catch (Exception e) {
            out.printf("Ошибка!!!! - %e", e);
        }
        finally {
            in.close();
            out.close();
        }
    }
}
