package gShildt_Test;

public class forEach2_35 {
    //Применение оператора break в цикле for в стиле for each
    public static void main(String args[]) {
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//использовать цикл for в стиле for each для
// вывода и суммирования значений из части массива
        for (int x : nums) {
            System.out.println("Знaчeниe равно: " + x);
            sum += x;
            if (x == 5) break; //прервать цикл после получения 5 значений
        }
            System.out.println("Сумма пяти первых элементов равна: " + sum);
        }
    }