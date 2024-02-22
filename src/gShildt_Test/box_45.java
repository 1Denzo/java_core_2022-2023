package gShildt_Test;

public class box_45 {
        // В этой программе объявляются два объекта класса Вох
        double width;
        double height;
        double depth;
        }
class box_45Demo2 {
    public static void main(String[] args) {
        box_45 mybox1 = new box_45();
        box_45 mybox2 = new box_45();
        double vol;
//присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        //присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
//рассчитать объем первого параллелепипеда
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Oбъeм равен " + vol);
        //рассчитать объем второго параллелепипеда
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Oбъeм равен " + vol);
    }
}
