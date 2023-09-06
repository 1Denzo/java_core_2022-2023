package LR11.Part2;

import java.util.Arrays;
import java.util.Map;

public class HashMap {

    public static void main(String[] args) {

        Map<Integer, String> numberAndStudent = new java.util.HashMap<>();
        String[] str = {"Антон", "Андрей", "Иван", "Евгений", "Сергей", "Павел",
                "Макар", "Степан", "Даниил", "Тимур"};
        for (int i = 0; i <= 9; i++) {
            numberAndStudent.put(i, str[i]);
        }
        System.out.println("HashMap:");
        printMap(numberAndStudent);
        System.out.println("Значения строк, ключ которых > 5 :" + Arrays.toString(getKeyMoreFive(numberAndStudent)));
        System.out.print("Строки, в ключах которых присуствует 0: ");
        zero(numberAndStudent);
        System.out.println("\nПроизведение ключей, строк в которых ключ > 5: " + multi(numberAndStudent));
    }

        private static int multi (Map < Integer, String > map){
            return map.entrySet().stream().filter(e -> e.getValue().length() > 5).mapToInt(Map.Entry::getKey).reduce(1, (x, y) -> x * y);
        }
        private static void zero (Map < Integer, String > map){
            map.entrySet().stream().filter(e -> e.getKey() == 0).forEach(e -> System.out.print(e.getValue() + ", "));
        }
            private static void printMap (Map < Integer, String > map){
                map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue() + ";"));
            }

            private static String[] getKeyMoreFive (Map < Integer, String > map){
                return map.entrySet().stream().filter(x -> x.getKey() > 5).map(Map.Entry::getValue).toArray(String[]::new);
            }

        }

       /* Set<Integer> keys = numberAndStudent.keySet();
        for (int i = 0 ; i < keys.size(); i++) {
            if (keys.iterator() == 0 & ) {
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(numberAndStudent.values());
        System.out.println("Значения: " + values);
    }
}
*/