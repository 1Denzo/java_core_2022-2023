package LR11.CollectionComparison;

import java.util.*;
public class Step2 {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Выборка элемента ArrayList: " + getRunningTime(arrayList));
        System.out.println("Выборка элемента LinkedHashMap: " + getMapRunningTime(linkedHashMap));
        System.out.println("Выборка элемента LinkedList: " + getRunningTime(linkedList));
    }

    private static long getRunningTime(List<Integer> list) {


        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 6000000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis(); // точка начала отсчета времени выполнения программы
        int k = list.get(3000000);
        long end = System.currentTimeMillis();// точка окончания отсчета времени выполнения программы
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
    private static long getMapRunningTime(Map<Integer, Integer> map) {
        for (int i = 0; i < 6000000; i++) {
            map.put(i, i);
        }
        long start = System.currentTimeMillis();
        int k = map.get(3000000);
        long end = System.currentTimeMillis();// точка окончания отсчета времени выполнения программы
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
}