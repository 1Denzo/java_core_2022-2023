package LR12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*5.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
 содержащий только те строки, которые содержат заданную подстроку*/
public class Example5 {
    public static void main(String[] args) {
        List<String> result = filterStrings(Arrays.asList(
                "Предоставляет возможность управлять порядком элементов в коллекции при помощи объекта ",
                "Comparator, либо сохраняет элементы с использованием natural ordering.",
                "Этот интерфейс описывает коллекции с предопределённым способом вставки и извлечения",
                "элементов, а именно — очереди FIFO (first-in-first-out). Помимо методов, определённых в",
                "интерфейсе Collection, определяет дополнительные методы для извлечения и добавления",
                "элементов в очередь. Большинство реализаций данного интерфейса находится в пакете"));
        System.out.println(result);
    }
    public static List<String> filterStrings(List<String> strings) {
        return Arrays.asList(strings.stream()
                .filter(s -> s.contains("Боль"))
                .collect(Collectors.toList()).toString());
    }

}