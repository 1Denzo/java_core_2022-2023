package LR12;

import java.util.*;
import java.util.stream.Collectors;

/*8.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
 содержащий только те числа, которые больше заданного значения.*/
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        System.out.println("Введите целевое число: ");
        int target = in.nextInt();
        List<Integer> num = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            num.add(random.nextInt(size));
        }
        System.out.println(moreThan(num, target));
    }
    public static List<Integer> moreThan(List<Integer> num, int target) {
        return num.stream()
                .filter(i -> i >= target) // фильтруем элементы списка по целевому числу
                .collect(Collectors.toList());
    }
}
