package LR12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*9.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
 содержащий только те строки, которые содержат только буквы (без цифр и символов).*/
public class Example9 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "Предоставляет возможность управлять 4 порядком элементов в коллекции при помощи объекта ",
                "Comparator, либо сохраняет элементы 4 с использованием natural ordering.",
                "Этот интерфейс описывает коллекции 4 с предопределённым способом вставки и извлечения",
                "элементов, а именно — очереди FIFO 4 (first-in-first-out). Помимо методов, определённых в",
                "интерфейсе Collection, определяет дополнительные методы для извлечения и добавления",
                "элементов в очередь. Большинство реализаций данного интерфейса находится в пакете");

        System.out.println(ListToStrings(stringList));
    }

    //Метод разбивает текст на слова
    public static String[] ListToStrings(List<String> list) {
        String[] strings = null;
        for (String string : list) {
            strings = string.split(" "); // разбиваем строку на массив символов по пробелам
            System.out.print(" " + strings);
        }
        return strings;
    }

    public static List<String> filterStrings(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();
        for (String string : strings) {
            String[] characters = string.split(" "); // разбиваем строку на массив символов по пробелам
            for (String character : characters) {
                char[] charArr = character.toCharArray();
                for (char cha : charArr) {
                    // проверяем, является ли символ буквой или цифрой
                    if (Character.isLetter(cha)) {
                        filteredStrings.add(string); // добавляем строку в отфильтрованный список
                    }
                }
            }
        }
        return filteredStrings;
    }
}
