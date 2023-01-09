package LR6.Test3;
import java.util.Arrays;
import static LR6.Test3.Test3.*;
public class main {
    public static void main(String[] args) {
            // массив вводных данных
            Test3.Method1();
            System.out.println("Максимальный член массива " + Max);
            System.out.println("Минимальный член массива " + Min); // вывод полученных данных
            System.out.println("Среднеарифметическое членов массива "+ Average);
            System.out.println("Обрабатываемый массив: " + Arrays.toString(Array));
        }
    }