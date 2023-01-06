package gShildt_Test;

public class recTest_61 {
    int values[];

    recTest_61(int i) {
        values = new int[i];
    }

    // вывести рекурсивно элементы массива
    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}
            class Recursion2 {
                public static void main(String[] args) {
                    recTest_61 ob = new recTest_61(15);
                    int i;
                    for (i = 0; i < 15; i++) ob.values[i] = i;
                    ob.printArray(15);
                }
            }