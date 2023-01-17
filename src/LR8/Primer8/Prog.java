package LR8.Primer8;

import java.io.*;
import java.net.URL;

import static java.lang.System.out;

public class Prog {
    public static void main(String[] args) {
        try {
            InputStream inFile = null, inUrl = null, inArray = null;
            Reader rFile = null, rUrl = null, rArray = null;
            try {
                inFile = new FileInputStream("C:\\temp\\MyFile1.txt");
                rFile= new InputStreamReader(inFile,"cp1251");
                FSWork.readAllByByte(rFile);
                System.out.print("\n\n\n");

                inUrl = new URL("http://google.com").openStream();
                rUrl  = new InputStreamReader(inUrl, "cp1251");
                FSWork.readAllByByte(rUrl);
                System.out.print("\n\n\n");

                inArray = new ByteArrayInputStream( new byte[] { 5, 8, 3, 9, 11 });
                rArray = new InputStreamReader(inArray,"cp1251");
                FSWork.readAllByByte(rArray);
                System.out.print("\n\n\n");
            } finally {
                inFile.close();
                rFile.close();
                inUrl.close();
                rUrl.close();
                inArray.close();
                rArray.close();
            }
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }

    private static void start() throws Exception {

    }
}
