package gShildt_Test;

class box2_46 {
    // В этой программе применяется метод, введенный в класс Вох
    double width;
    double height;
    double depth;

    // вывести объем параллелепипеда
    void volume() {
        System.out.print("Oбъeм равен ");
        System.out.println(width * height * depth);
    }
}
            class BoxDemoZ {
                public static void main(String[] args) {
                    box2_46 mybox1 = new box2_46();
                    box2_46 mybox2 = new box2_46();
                    // присвоить значение переменным экземпляра mybox1
                    mybox1.width = 10;
                    mybox1.height = 20;
                    mybox1.depth = 15;
/* присвоить другие значения переменным
экземпляра mybox2 */
                    mybox2.width = 3;
                    mybox2.height = 6;
                    mybox2.depth = 9;
// вывести объем первого параллелепипеда
                    mybox1.volume();
// вывести объем второго параллелепипеда
                    mybox2.volume();

                }
            }
