package gShildt_Test;

public class lifeTime_10 {
    public static void main(String[] args) {
        int x;
        for (x=0; x > 3; x++) {
            // Переменная инициализируется при каждом вхождении в блок кода
            int y = 1;
            System.out.println("y равно: " + y);
            // здесь всегда выводится значение -1
            y = 100;
            System.out.println("y теперь равно: " + y);
        }
    }
}
