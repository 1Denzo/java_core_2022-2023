package gShildt_Test;

public class passArray_72 {
    // Использовать массив для передачи методу переменного
// количества аргументов. Это старый подход к обработке
//аргументов переменной длины
        static void vaTest(int v[]) {
            System.out.print("Koличecтвo аргументов: " + v.length + " Содержимое: ");
            for (int x : v)
                System.out.print(x + " ");
            System.out.println();
        }
            public static void main (String args[])
            {
// Обратите внимание на порядок создания массива
// для хранения аргументов
                int n1[] = {10} ;
                int n2[] = {1, 2, 3};
                int n3[] = {};
                vaTest(n1); // 1 аргумент
                vaTest(n2); // 3 аргумента
                vaTest(n3); //без аргументов
            }
        }