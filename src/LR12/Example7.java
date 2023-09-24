package LR12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*7.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
 содержащий только те строки, которые имеют длину больше заданного значения.*/
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целевое число: ");
        int target = in.nextInt();
        List <String> list = Arrays.asList(
                "Предоставляет возможность управлять порядком элементов в коллекции при помощи объекта ",
                "Comparator, либо сохраняет элементы с использованием natural ordering.",
                "Этот интерфейс описывает коллекции с предопределённым способом вставки и извлечения",
                "элементов, а именно — очереди FIFO (first-in-first-out). Помимо методов, определённых в",
                "интерфейсе Collection, определяет дополнительные методы для извлечения и добавления",
                "элементов в очередь. Большинство реализаций данного интерфейса находится в пакете");
        System.out.println(filterLengths(list, target));
    }
    public static List<String> filterLengths(List<String> lines, int target) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (line.length() >= target && !result.contains(line)) {
                result.add(line);
            }
        }
        return result;
    }
}
