package LR8.Task2;
// Импортируем необходимые библиотеки
import java.io.BufferedWriter;
import java.io.FileWriter;
public class af1 {

    public static void main(String[] args) {
        try
        {
            // Создаем текстовый файл
            FileWriter fw = new FileWriter("WriteData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            // Записыва несколько чисел в файл
            bw.write("10");
            bw.newLine();
            bw.write("20");
            bw.newLine();
            bw.write("30");
            bw.newLine();

            // Закрываем файл
            bw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}