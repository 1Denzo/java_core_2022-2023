package LR10.Example4XLSX;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExelFileExample {
    private static final String TAG_PATHFILE =
            "C:\\Users\\reus\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example4XLSX\\1xlsx.xlsx";
    public static void main(String[] args) {
        try {
            // Открываем файл Exel для чтения
            FileInputStream inputStream = new FileInputStream(TAG_PATHFILE);

            // Создаем экземпляр книги Exel из файла
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            // Получаем лист из книги по его имени
            XSSFSheet sheet = workbook.getSheet("Товары");

            // Перебираем строки и ячейки  листа
            for (Row row : sheet) {
                for (Cell cell : row) {
                    // Выводим зачение ячейки на экран
                    System.out.println(cell.toString() + "\t");
                }
                System.out.println();
            }
            // Закрываем файл и освобождаем ресурсы
            workbook.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
