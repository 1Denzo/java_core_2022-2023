package Timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class Task_1723 {
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        String input = buffer.readLine();

        int max = -1;
        Character result = null;
        for (int index = 0; index < input.length(); index++) {
            int current = input.replaceAll("[^" + input.charAt(index) + "]", "").length();
            if (max < current) {
                max = current;
                result = input.charAt(index);
            }
        }

        out.print(result);
        out.flush();
    }
}

