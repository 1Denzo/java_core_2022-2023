package LR11.CollectionComparison;

import java.util.*;

public class Step1 {

        public static void main(String[] args) {

            List<Integer> arrayList = new ArrayList<>();
            Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
            List<Integer> linkedList = new LinkedList<>();

            System.out.println("Время выполнения операции удаления в начале arrayList = " + getRunningTime(arrayList));
            System.out.println("Время выполнения операции  удаления в начале likedHashMap = " + getMapRunningTime(linkedHashMap));
            System.out.println("Время выполнения операции удаления в начале linkedList = " + getRunningTime(linkedList));
        }

        private static long getRunningTime(List<Integer> list){


            // блок кода в котором выполняется операция добавления
            for (int i = 0; i < 6000000; i++) {
                list.add(i);
            }
            long start = System.currentTimeMillis(); // точка начала отсчета времени выполнения программы
            list.remove(0);
            long end = System.currentTimeMillis();// точка окончания отсчета времени выполнения программы
            // вывод в консоль времени выполнения блока кода содержащего операцию
            return end - start;

        }
    private static long getMapRunningTime(Map<Integer, Integer> map){
        for (int i = 0; i < 6000000; i++) {
            map.put(i, i);
        }
        long start = System.currentTimeMillis();
        map.remove(0);
        long end = System.currentTimeMillis();// точка окончания отсчета времени выполнения программы
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
    }

/*`// Создание множества
        Map<String, Integer> map = new LinkedHashMap<>();

// Добавление элементов
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);

// Поиск элемента по ключу
        map.entrySet().iterator().next(); // ключ - строка, тип ключа - int
        map.get("key1"); // значение - число 1

// Изменение размера множества
        map.clear();
        map.put("key4", 4);

// Удаление элемента по ключу
        map.entrySet().iterator().next(); // ключ - строка, тип ключа - int
        map.remove("key4"); // значение - число 4

// Вывод множества на экран
        System.out.println("Множество:");
        for (Entry<String, Integer> entry : map.entrySet()) {
        System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }*/