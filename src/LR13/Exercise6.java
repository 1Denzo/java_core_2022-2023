package LR13;
/*Напишите функцию, которая суммирует элементы в массиве целых чисел при помощи многопоточности.
 Количество потоков должно быть равно количеству ядер процессора.*/
import java.util.Random;
import java.util.Scanner;

public class Exercise6 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Введите размер массива: ");
            int size = in.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(size);
            }
            int sum = multithreadedSum(arr);
            System.out.println(sum);
        }

        public static int multithreadedSum(int[] array) {
            final int processors = Runtime.getRuntime().availableProcessors();
            int chunkSize = array.length / processors;
            final int[] sum = {0};

            Thread[] threads = new Thread[processors];

            for (int i = 0; i < processors; i++) {
                final int start = i * chunkSize;
                final int end = (i == processors - 1) ? array.length : (i + 1) * chunkSize;
                threads[i] = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int partialSum = 0;
                        for (int j = start; j < end; j++) {
                            partialSum += array[j];
                        }
                        sum[0] += partialSum;
                    }
                });
                threads[i].start();
            }
            try {
                for (Thread thread : threads) {
                    thread.join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return sum[0];
        }
    }
