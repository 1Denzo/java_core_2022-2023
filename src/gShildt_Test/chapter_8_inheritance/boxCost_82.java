package gShildt_Test.chapter_8_inheritance;

class boxCost_82 {
    // Расширение класса BoxWeight включением в него
//поля стоимости доставки
// создать сначала класс Вох
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта
    boxCost_82(boxCost_82 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    boxCost_82(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый в отсутствие размеров
    boxCost_82() {
        width = -1;
        height = -1;
        depth = -1;
// значение -1 служит для обозначения
// неинициализированного
// параллелепипеда
    }

    // конструктор, применяемый при создании куба
    boxCost_82(double len) {
        width = height = depth = len;
//рассчитать и возвратить объем
    }

    double volume() {
        return width * height * depth;
    }
}

    //добавить поле веса
    class BoxWeight82 extends boxCost_82 {
        double weight; // вес параллелепипеда

        // сконструировать клоно бъекта
        BoxWeight82(BoxWeight82 ob) { // передать объект конструктору
            super(ob);
            weight = ob.weight;
        }

        // конструктор, применяемый при указании всех параметров
        BoxWeight82(double w, double h, double d, double m) {
            super(w, h, d); //вызвать конструктор суперкласса
            weight = m;
        }

        // конструктор, применяемый по умолчанию
        BoxWeight82() {
            super();
            weight = -1;
        }

        //конструктор, применяемый при создании куба
        BoxWeight82(double len, double m) {
            super(len);
            weight = m;
        }
    }

        // добавить поле стоимости доставки
        class Shipment extends BoxWeight82 {
            double cost;

            // сконструировать клон объекта
            Shipment(Shipment ob) { //передать объект конструктору
                super(ob);
                cost = ob.cost;
            }

            //конструктор, используемый при указании всех параметров
            Shipment(double w, double h, double d, double m, double c) {
                super(w, h, d, m);  //вызвать конструктор суперкласса
                cost = c;
            }

            Shipment() {//конструктор, применяемый по умолчанию
                super();
                cost = -1;
            }

            //конструктор, применяемый при создании куба
            Shipment(double len, double m, double c) {
                super(len, m);
                weight = c;
            }
        }
                                                    class DemoShipment {
                                                        public static void main(String[] args) {
                                                            Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
                                                            Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
                                                            double vol;
                                                            vol = shipment1.volume();
                                                            System.out.println("Oбъeм shipment1 равен " + vol);
                                                            System.out.println("Вес shipment1 равен " + shipment1.weight);
                                                            System.out.println("Cтoимocть доставки: $" + shipment1.cost);
                                                            System.out.println();
                                                            vol = shipment2.volume();
                                                            System.out.println("Oбъeм shipment2 равен " + vol);
                                                            System.out.println("Bec shipment2 равен" + shipment2.weight);
                                                            System.out.println("Cтoимocть доставки: $" + shipment2.cost);
                                                        }
}
