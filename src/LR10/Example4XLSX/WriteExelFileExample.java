package LR10.Example4XLSX;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteExelFileExample {
    private static final String TAG_PATHFILE =
            "C:\\Users\\reus\\IdeaProjects\\java_core_2022-2023\\src\\LR10\\Example4XLSX\\";

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in, "UTF-8");
            System.out.print("Введите имя файла XLSX для сохранения результатов: " + "\n");
            String fname = sc.nextLine();
            // Создаем новую книгу Exel
            XSSFWorkbook workbook = new XSSFWorkbook();
            // Создаем новый лист в книге
            XSSFSheet sheet = workbook.createSheet("Товары");
            // Записываем данные в ячейки
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Товар");
            headerRow.createCell(1).setCellValue("Характеристики");
            headerRow.createCell(2).setCellValue("Стоимость");

            Row dataRow1 = sheet.createRow(1);
            dataRow1.createCell(0).setCellValue("Книга");
            dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
            dataRow1.createCell(2).setCellValue(500);

            Row dataRow2 = sheet.createRow(2);
            dataRow2.createCell(0).setCellValue("Компьютер");
            dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, оперативная память 8 Гб");
            dataRow2.createCell(2).setCellValue(25000);

            // Записываем книгу Exel в файл
            FileOutputStream outputStream = new FileOutputStream(TAG_PATHFILE + fname + ".xlsx");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Данные записаны в файл: " + TAG_PATHFILE + fname + ".xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
