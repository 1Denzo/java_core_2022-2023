package LR8.Task3;

import java.io.File;
import java.util.ArrayList;

import static java.lang.System.out;

public class Program {
    private final static char[] consonantsRU = new char[] {
        'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'
    };

    public static void main(String[] args) {
        try {
            var fileInfo = FSWorker.readFileToCollection("C:\\temp\\f1.txt");
            var file = new File("C:\\temp\\f2.txt");
            file.delete();
            file.createNewFile();
            for (int i = 0; i < fileInfo.size(); i++) {
                var line = fileInfo.get(i);
                var wordsToLine = line.split(",| ");
                var wordsToFile = new ArrayList<String>();
                if (wordsToLine.length != 0) {
                    for (String word : wordsToLine)
                        if (word.length() != 0 && isCharConsonant(word.charAt(0)))
                            wordsToFile.add(word);
                }
                FSWorker.writeParamsToFile("C:\\temp\\f2.txt", true, String.format("%d - ", i + 1));
                FSWorker.writeCollectionToFile("C:\\temp\\f2.txt", true, wordsToFile, ", ");
                FSWorker.writeParamsToFile("C:\\temp\\f2.txt", true, String.format(" (%d слов(а))\n", wordsToFile.size()));
            }
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }

    private static void start() throws Exception {

    }

    private static boolean isCharConsonant(char character) {
        for (char consonant: consonantsRU)
            if(Character.toLowerCase(character) == Character.toLowerCase(consonant))
                return true;
        return false;
    }
}
