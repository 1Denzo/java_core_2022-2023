package gShildt_Test;

public class box4_48 {
    // В этой программе применяется метод с параметрами
    double width;
    double height;
    double depth;

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
        // установить размеры параллелепипеда
        void setDim ( double w, double h, double d){

        width = w;
        height = h;
        depth = d;
    }
}
    class BoxDemo5 {
        public static void main(String args[]) {
            box4_48 mybox1 = new box4_48();
            box4_48 mybox2 = new box4_48();
            double vol;
// инициализировать каждый экземпляр класса Вох
            mybox1.setDim(10, 20, 15);
            mybox2.setDim(3, 6, 9);
// получить объем первого параллелепипеда
            vol = mybox1.volume();
            System.out.println("Oбъeм равен " + vol);
            // получить объем второго параллелепипеда
            vol = mybox2.volume();
            System.out.println("Oбъeм равен " + vol);
        }
    }