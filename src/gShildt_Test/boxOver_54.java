package gShildt_Test;

public class boxOver_54 {
    /* В данном примере конструкторы определяются
в классе Вох для инициализации размеров
параллелепипеда тремя разными способами
*/
    double width;
    double height;
    double depth;

    // конструктор, используемый, когда указываются все размеры
    boxOver_54(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор, используемый, когда ни один из размеров не указан
    boxOver_54() {
        width = -1;
//использовать значение обозначения неинициализированного параллелепипеда
        height = -1;
        depth = -1;
    }

    //конструктор, используемый при создании куба
    boxOver_54(double len) {
        width = height = depth = len;
    }

    //рассчитать возвратить объем
    double volume() {
        return width*height*depth;
    }
}
class OverloadCons {
    public static void main(String[] args) {
//создать параллелепипеды, используя разные конструкторы
        boxOver_54 mybox1 = new boxOver_54(10, 20, 15);
        boxOver_54 mybox2 = new boxOver_54();
        boxOver_54 mycube = new boxOver_54(8);
        double vol;
//получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
//получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
//получить объем куба
        vol = mycube.volume();
        System.out.println("Oбъeм mycube равен " + vol);
    }
}