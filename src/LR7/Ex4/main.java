package LR7.Ex4;

/*Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии.*/
public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        supA obj1 = new supA('G');
        subB obj2 = new subB('D', "Привет!");
        subC obj3 = new subC('B', "Пока!", 189);
        //supA clone1 = (supA) obj1.clone();
        subB clone2 = (subB) obj2.clone();
        subC clone3 = (subC) obj3.clone();
        System.out.println("Char n: " + obj1.getN());
        System.out.println("Char n: " + obj2.getN() + " String j: " + obj2.getJ());
        System.out.println("Char n: " + obj3.getN() + " String j: " + obj3.getJ() + " Int num: " + obj3.getNum());
    }
}
