package LR10.Example4XLSX;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExelFileExample {
    public static void main(String[] args) throws IOException {
        // Открываем файл Exel для чтения
        String filePath = "C:\\Users\\reus\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example4XLSX\\exampleExel.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

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
    }
}
