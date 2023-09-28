package LR13;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;


/*Напишите функцию, которая находит максимальный элемент в массиве целых чисел при помощи многопоточности.
 Количество потоков должно быть равно количеству ядер процессора.*/
public class Exercise5 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size);
        }
        int max = findMax(arr);
        System.out.println("Максимальное значение в массиве: " + max);
    }

    public static int findMax(int[] arr) throws ExecutionException, InterruptedException {
        int max = Integer.MIN_VALUE;
        // Создаем пул потоков с фиксированным количеством потоков
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        // Создаем массив Future<Integer> для хранения результатов
        Future<Integer>[] results = new Future[arr.length];

        // Запускаем каждую задачу в отдельном потоке
        for (int i = 0; i < arr.length; i++) {
            final int index = i;
            results[i] = executor.submit(() -> {
                return arr[index];
            });
        }
        // Ожидаем завершения всех задач и находим максимальное значение
        for (Future<Integer> result : results) {
            int value = result.get();
            if (value > max) {
                max = value;
            }
        }
        // Завершаем пул потоков
        executor.shutdown();
        return max;
    }
}

