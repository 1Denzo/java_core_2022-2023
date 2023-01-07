package gShildt_Test.chapter_8_inheritance;
class boxSuper_80 {
    // Полная реализация класса BoxWeight
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта
    boxSuper_80(boxSuper_80 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    boxSuper_80(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый в отсутствие размеров
    boxSuper_80() {
        width = -1; // значение -1 служит для обозначения неинициализированного параллелепипеда
        height = -1;
        depth = -1;
    }

    // конструктор, применяемый при создании куба
    boxSuper_80(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
            // Теперь в классе BoxWeight полностью
            //реализованы все конструкторы
            class BoxWeight5 extends boxSuper_80 {
                double weight; // вес параллелепипеда
                // сконструировать клон объекта
                BoxWeight5(BoxWeight5 ob) { //передать объект конструктору
                    super(ob);
                    weight = ob.weight;
                }
// конструктор, применяемый при указании всех параметров
                    BoxWeight5( double w, double h, double d, double m) {
                        super(w, h, d); // вызвать конструктор из суперкласса
                        weight = m;
                    }
                    // конструктор, применяемый по умолчанию
                    BoxWeight5() {
                    super();
                    weight = -1;
                }
// конструктор, применяемый при создании куба
                    BoxWeight5( double len, double m) {
                    super(len);
                    weight = m;
                }
                }
                        class DemoSuper {
                            public static void main(String args[]) {
                                BoxWeight5 mybox1 = new BoxWeight5(10, 20, 15, 34.3);
                                BoxWeight5 mybox2 = new BoxWeight5(2, 3, 4, 0.076);
                                BoxWeight5 mybox3 = new BoxWeight5(); //по умолчанию
                                BoxWeight5 mycube = new BoxWeight5(3, 2);
                                BoxWeight5 myclone = new BoxWeight5(mybox1);
                                double vol;
                                vol = mybox1.volume();
                                System.out.println("Oбъeм mybox1 равен " + vol);
                                System.out.println("Вес mybox1 равен " + mybox1.weight);
                                System.out.println();
                                vol = mybox2.volume();
                                System.out.println("Oбъeм mybox2 равен " + vol);
                                System.out.println("Вес mybox2 равен" + mybox2.weight);
                                System.out.println();
                                vol = mybox3.volume();
                                System.out.println("Oбъeм mybox3 равен" + vol);
                                System.out.println("Вес mybox3 равен " + mybox3.weight);
                                System.out.println();
                                vol = myclone.volume();
                                System.out.println("Oбъeм myclone равен " + vol);
                                System.out.println("Вес myclone равен" + myclone.weight);
                                System.out.println();
                                vol = mycube.volume();
                                System.out.println("Объем mycube равен " + vol);
                                System.out.println("Вес mycube равен " + mycube.weight);
                                System.out.println();
                            }
                        }