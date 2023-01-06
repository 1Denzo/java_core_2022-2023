package gShildt_Test;

public class varArray_73 {
    // Продемонстрировать применение аргументов переменной длины
    //теперь метод vaTest() объявляется с аргументами
    // переменной длины
    static void vaTest(int... v) {
        System.out.print("Koличecтвo аргументов: " + v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        // Обратите внимание на возможные способы вызова
        // метода vaTest() с аргументами переменной длины
        vaTest(10); // 1 аргумент
        vaTest(1, 2, 3); // 3 аргумента
        vaTest(); // без аргументов
    }
}