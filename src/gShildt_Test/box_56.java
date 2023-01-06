package gShildt_Test;

public class box_56 {
    // В этой версии класса Вох один объект допускается
    // инициализировать другим объектом
        double width;
        double height;
        double depth;
        //Обратите внимание на этот конструктор. В качестве
        //параметра в нем используется объект типа Вох
        box_56(box_56 ob) { //передать объект конструктору
            width = ob.width;
            height = ob.height;
            depth = ob.depth;
        }
// конструктор, используемый, когда
//указываются все размеры
box_56(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
}
// конструктор, используемый, если ни один из
//размеров не указан
box_56() {
    width = -1;
    height = -1;
    depth = -1;

// использовать значение -1 для
// обозначения неинициализированного параллелепипеда
}
//конструктор, используемый при создании куба
box_56(double len) {
    width = height = depth = len;
}
//рассчитать и возвратить объем
    double volume () {
        return width * height * depth;
    }
}
                        class OverloadCons2 {
                            public static void main(String[] args) {
                                // создать параллелепипеды, используя разные конструкторы
                                box_56 mybox1 = new box_56(10, 20, 15);
                                box_56 mybox2 = new box_56();
                                box_56 mycube = new box_56(7);
                                box_56 myclone = new box_56(mybox1);
// создать копию объекта mybox1
                                double vol;
// получить объем первого параллелепипеда
                                vol = mybox1.volume();
                                System.out.println("Oбъeм mybox1 равен " + vol);
// получить объем второго параллелепипеда
                                vol = mybox2.volume();
                                System.out.println("Oбъeм mybox2 равен " + vol);
//получить объем куба
                                vol = mycube.volume();
                                System.out.println("Oбъeм куба равен " + vol);
// получить объем клона
                                vol = myclone.volume();
                                System.out.println("Oбъeм клона равен " + vol);
                            }
                        }