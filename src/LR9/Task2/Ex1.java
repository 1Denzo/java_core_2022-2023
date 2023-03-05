package LR9.Task2;

import java.util.Scanner;
import java.util.InputMismatchException;
/* Задание 1 Программа, вычисляющяя среднее значение среди положительных элементов одномерного массива (тип элементов int),
 вводимого с клавиатуры, создать обработчики ошибок, возникающих в следующих случаях:
–	ввод строки вместо числа;
–	несоответствие числового типа данных;
–	положительные элементы отсутствуют.
*/
public class Ex1 {
    private static String e;

    public static void main(String[] args) {


            System.out.println("Программа считает среднее арифметические всех введеных вами чисел. Введите размер массива: ");
            int size = 0;
            Scanner in = new Scanner(System.in);
        try {
            size = in.nextInt(); //размер массива
        }
        catch (InputMismatchException e) {
        System.out.println("Введено слишком большое число, введен знак или символ");
    }
        int[] array = null;
        try {
            array = new int[size];
        }
        catch (NegativeArraySizeException e) { //Обработка ошибки ввода размера массива
            System.out.println("Отрицательный размер массива!!!");
            System.exit(1);
        }
            int sum = 0; //Переменная для подсчета суммы элементов массива
            float average = 0; //Переменная для подсчета средней арифметичесой элементов массива
        int k = 0;
            for (int i = 0; i < size; i++) { //Заполнение массива в цикле
                System.out.println("Введите " + (i + 1) + " элемент массива: "); // непосредственно ввод элементов массива
                try {
                array[i] = in.nextInt();
                     if(array[i] < 0) throw new NegativeArrayElement("Элемент массива меньше 0!!!", array[i]);
            }
                catch (NegativeArrayElement e) {
                    System.out.println(e.getMessage());
                    System.out.println(e.getNumber());
                    System.exit(1);
                }
                catch (InputMismatchException e) { //Обработка ошибки ввода размера массива
                    System.out.println("Введено слишком большое число, введен знак или символ!!!");
                    System.exit(1);
                }
                sum = sum + array[i];
                average = (float) sum/ (i + 1);
                System.out.println("Сумма элементов: " + sum + " Среднеарифметическая по введенному массиву: " + average);
            }}}
class NegativeArrayElement extends Exception{

    private int number;
    public int getNumber(){return number;}
    public NegativeArrayElement(String message, int num) {

        super(message);
        number = num;
    }}