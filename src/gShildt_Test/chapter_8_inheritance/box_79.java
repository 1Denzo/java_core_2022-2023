package gShildt_Test.chapter_8_inheritance;
// В этой программе наследование применяется
//для расширения класса Вох
class box_79 {
    double width;
    double height;
    double depth;

    //сконструировать клон объекта
    box_79(box_79 ob) { //передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // значение -1 служит для обозначения
//неинициализированного параллелепипеда
    box_79(double w, double h, double d) {
        // конструктор, применяемый при указании всех размеров
        width = w;
        height = h;
        depth = d;
    }

    box_79() { //конструктор, Вох применяемый в отсутствие размеров
        width = -1;
        height = -1;
        depth = -1;
    }

    box_79(double len) {// конструктор, применяемый при создании куба
        width = height = depth = len;
    }

    double volume() { //рассчитать и возвратить объем
        return width * height * depth;
    }
}
//расширить класс Вох, включив в него поле веса
                    class BoxWeight extends box_79 {
    double weight; // вес параллелепипеда

    //конструктор BoxWeight()
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
                        class DemoBoxWeight {
                            public static void main(String args[]) {
                                BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
                                BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
                                double vol;
                                vol = mybox1.volume();
                                System.out.println("Oбъeм mybox1 равен" + vol);
                                System.out.println(
                                        "Вес myboxl равен " + mybox1.weight);
                                System.out.println();
                                vol = mybox2.volume();
                                System.out.println("Oбъeм mybox2 равен " + vol);
                                System.out.println("Вес mybox2 равен" + mybox2.weight);
                            }
                            }