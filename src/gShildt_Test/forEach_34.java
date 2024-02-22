package gShildt_Test;

public class forEach_34 {
    //Применение цикла for в стиле for each
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
// использовать цикл в стиле for each для вывода и
// суммирования значений
        for (int x : nums) {
            System.out.println("Знaчeниe равно: " + x);
            sum += x;
        }
            System.out.println("Cyммa равна: " + sum);
          }
}