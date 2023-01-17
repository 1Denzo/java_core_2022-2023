package LR8.Primer8;

import java.io.IOException;
import java.io.Reader;

public class FSWork {
    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) System.out.print((char) oneByte);
            else {
                System.out.print("\n" + " конец ");
                break;
            }
        }
    }
}
