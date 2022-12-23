package gShildt_Test;

public class boxAut_49 {
    /* В данном примере программы для инициализации размеров
параллелепипеда в классе Вох применяется конструктор
*/
    double width;
    double height;
    double depth;

    //Это конструктор класса Вох
    boxAut_49() {
        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        width = 10;
        height = 10;
        depth = 10;
    }
//рассчитать и возвратить объем
        double volume () {
            return width * height * depth;
        }
    }
                class BoxDemoб {
                    public static void main(String args[]) {
// объявить, выделить память и инициализировать
//объекты типа Вох
                        boxAut_49 mybox1 = new boxAut_49();
                        boxAut_49 mybox2 = new boxAut_49();
                        double vol;
                        // получить объем первого параллелепипеда
                        vol = mybox1.volume();
                        System.out.println("Oбъeм равен " + vol);
                        // получить объем второго параллелепипеда
                        vol = mybox2.volume();
                        System.out.println("Oбъeм равен " + vol);
                    }
                }