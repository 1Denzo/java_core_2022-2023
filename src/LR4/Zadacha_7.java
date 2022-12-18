package LR4;
import java.util.Scanner;
public class Zadacha_7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);                                        // Создание объекта класса Scanner
        System.out.print("введите количество строк массива: ");
        int x = id.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int y = id.nextInt();
        int[][] ArrayZmeyka = new int[x][y];                                        // создание массива
        int hvost = 0;                                                              //переменная для подсчета использованных значений
        int telo = 0;                                                               //переменная для заполнения элементов массива
        int h = 0;                                                                  //вспомогательная переменная для подсчета строк
        for (int i = 0; h < ArrayZmeyka.length; h++) {
            for (int j = 0; j < (ArrayZmeyka[i].length - hvost); j++) {              //заполнение верхней строки массива слева-направо
                ArrayZmeyka[i][j] = telo;
                telo++;
            }
            if (i < ArrayZmeyka.length - 1) {
                i++;
            }
            for (int o = x - 1; o > hvost; o--) {                 //заполнение правого столбца массива снизу-вверх
                ArrayZmeyka[o][ArrayZmeyka[i].length - 1 - hvost] = telo;
                telo++;
            }
            hvost++;
        }
        int z = 0;                                                                  //вспомогательная переменная для подсчета символов в строке
        for (int i = 0; i < ArrayZmeyka.length; i++) {                               //печать массива
            int count = i + 1;                                                        //переменная для повышения номера индекса для вывода на консоль
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < ArrayZmeyka[i].length; j++) {
                System.out.print(ArrayZmeyka[i][j] + " ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;                                                                  //обнуление счетчика символов
        }
    }
}
