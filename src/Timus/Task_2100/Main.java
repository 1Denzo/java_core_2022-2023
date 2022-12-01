package Timus.Task_2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/Timus/Task_2100/input2.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int MarshalAndLilly = 2;
        try {
            BufferedReader bueferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine = "";
            int numberOfFrends = 0;
            int numberOfPairs = 0;
            while ((readLine = bueferedReader.readLine()) !=null) {
                if (numberOfFrends == 0) {
                    numberOfFrends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")) {
                    numberOfPairs++;
                }
            }
            int result;
            int guest = MarshalAndLilly + numberOfFrends + numberOfPairs;
            if (guest == 13) {
                result = (guest + 1) * 100;
            } else {
                result = guest * 100;
            }
            System.out.println(result);
        } catch (IOException exeption) {
            exeption.printStackTrace();
        }
    }
}