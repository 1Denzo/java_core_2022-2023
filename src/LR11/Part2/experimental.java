package LR11.Part2;

import java.util.HashMap;
public class experimental {
    /*
    Перепись населения
    */
        public static HashMap<String, String> createMap() {
            HashMap<String, String> list = new HashMap<>();
            list.put("Савин", "Анатолий");
            list.put("Панарин", "Андрей");//напишите тут ваш код
            list.put("Сапожников", "Денис");//напишите тут ваш код
            list.put("Мадатов", "Роберт");//напишите тут ваш код
            list.put("Жезлов", "Дмитрий");//напишите тут ваш код
            list.put("Левченко", "Игорь");//напишите тут ваш код
            list.put("Крижановский", "Сергей");//напишите тут ваш код
            list.put("Печенька", "Наташа");//напишите тут ваш код
            list.put("Замиховский", "Сергей");//напишите тут ваш код
            list.put("Арженовскова", "Нина");
            return list;//напишите тут ваш код
        }
        public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
            int key = 0;
            for( HashMap.Entry pair:map.entrySet()) {
                if(pair.getValue() == name) {
                    key++;
                }
            }
            return key;
        }
        public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
            int n=0;
            for( HashMap.Entry pair:map.entrySet()) {
                if(pair.getKey().equals(lastName)) {
                    n++;
                }
            }
            return n;
        }

    public static void main(String[] args) {
        HashMap<String, String> mapa = createMap();
        String name = "Сергей";
        int filtred = getCountTheSameFirstName(mapa, name);
        System.out.println(filtred);
    }
}
