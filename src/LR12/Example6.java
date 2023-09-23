package LR12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*6.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
 содержащий только те числа, которые делятся на заданное число без остатка.*/
public class Example6 {
    public static void main(String[] args) {
        List <Integer> arraylist = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        System.out.println("Введите целевое число: ");
        int target = in.nextInt();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arraylist.add(random.nextInt(size));
        }
        System.out.println("список, содержащий только те числа, которые делятся на заданное число без остатка" + "\n" +
                filterDivisibleBy(arraylist, target) );
    }
    public static List<Integer> filterDivisibleBy(List<Integer> numbers, int target) {
        return numbers.stream()
                .filter(i -> 0 == (i % target)) // фильтруем элементы списка по четности
                .collect(Collectors.toList());
    }
    }
