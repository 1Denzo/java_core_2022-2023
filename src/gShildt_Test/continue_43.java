package gShildt_Test;

public class continue_43 {
    //Применение оператора break в качестве цивилизованной
//формы оператора goto
    public static void main(String[] args) {
        // Продемонстрировать применение оператора continue
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println();
        }
    }
}