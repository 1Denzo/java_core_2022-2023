package LR7.Ex1;
/*Напишите программу, в которой есть суперкласс с приватным текстовым полем,
 конструктором с текстовым параметром и где переопределен метод toString (). На основе
 суперкласса путем наследования создается подкласс. У него появляется еще одно
 приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
 двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
 В обоих классах метод toString () переопределяется так, что он возвращает строку с
 названием класса и значение текстового поля или текстовых полей.*/
public class main {
        public static void main(String[] args) {
            superClassTest superClassObject = new superClassTest("передал в конструктор суперкласса");
            String className = superClassObject.toString();
            System.out.println(className);
            subClassTest subClassObject1 = new subClassTest("передал в конструктор подкласса");
            String subClassName = subClassObject1.toString();
            System.out.println(subClassName);
            subClassTest subClassObject2 = new subClassTest("передал в конструктор подкласса", "где два параметра");
            String subClassName2 = subClassObject2.toString();
            System.out.println(subClassName2);
        }
    }
