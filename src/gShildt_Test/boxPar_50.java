package gShildt_Test;

public class boxPar_50 {
    /*В данном примере программы для инициализации размеров параллелепипеда в классе
Вох применяется параметризированный конструктор*/

    double width;
    double height;
    double depth;

    //Это конструктор класса Вох
    boxPar_50(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
                class
                BoxDemo7 {
                    public static void main(String[] args) {
//объявить, выделить память и инициализировать объекты типа Вох
                        boxPar_50 myboxl = new boxPar_50(10, 20, 15);
                        boxPar_50 mybox2 = new boxPar_50(3, 6, 9);
                        double vol;
//получить объем первого параллелепипеда
                        vol = myboxl.volume();
                        System.out.println("Oбъeм равен " + vol);
//получить объем второго параллелепипеда
                        vol = mybox2.volume();
                        System.out.println("Oбъeм равен " + vol);
                    }
                }