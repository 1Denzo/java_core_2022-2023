package gShildt_Test;

public class noChange_36 {
    //Переменная цикла в стиле for each доступна только для чтения
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //x = x * 10;  этот оператор не оказывает никакого
        // влияния на массив nums
        for (int x : nums) System.out.print(x + " ");
    }
}