package gShildt_Test;

public class box3_47 {
    // Теперь метод volume() возвращает объем параллелепипеда
    double width;
    double height;
    double depth;

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
        class BoxDemo4 {
            public static void main(String[] args) {
                box3_47 mybox1 = new box3_47();
                box3_47 mybox2 = new box3_47();
                double vol;
//присвоить значения переменным экземпляра myboxl
                mybox1.width = 10;
                mybox1.height = 20;
                mybox1.depth = 15;
/* присвоить другие значения переменным
экземпляра mybox2 */
                mybox2.width = 3;
                mybox2.height = 6;
                mybox2.depth = 9;
                // получить объем первого параллелепипеда
                vol = mybox1.volume();
                System.out.println("Oбъeм равен " + vol);
                // получить объем второго параллелепипеда
                vol = mybox2.volume();
                System.out.println("Oбъeм равен " + vol);
            }
        }
