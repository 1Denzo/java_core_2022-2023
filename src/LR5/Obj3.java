package LR5;
public class Obj3 {
    // В этой версии класса Вох один объект допускается
    // инициализировать другим объектом
    double width;
    double height;
    //Обратите внимание на этот конструктор. В качестве
    //параметра в нем используется объект типа Вох
    Obj3(Obj3 ob) { //передать объект конструктору
        width = ob.width;
        height = ob.height;

    }
    // конструктор, используемый, когда
//указываются все размеры
    Obj3(double w, double h) {
        width = w;
        height = h;

    }
    // конструктор, используемый, если ни один из
//размеров не указан
    Obj3() {
        width = -1;
        height = -1;

// использовать значение -1 для
// обозначения неинициализированного прямоугольника
    }
    //конструктор, используемый при создании квадрата
    Obj3(double len) {
        width = height = len;
    }
    //рассчитать и возвратить площадь
    double area () {
        return width * height;
    }
}
class Cons3 {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные конструкторы
        Obj3 myarea1 = new Obj3(10, 20);
        Obj3 myarea2 = new Obj3();
        Obj3 mysqare = new Obj3(7);

// создать копию объекта mybox1
        double ar;
// получить объем первого параллелепипеда
        ar = myarea1.area();
        System.out.println("Площадь myarea1 равна " + ar);
// получить объем второго параллелепипеда
        ar = myarea2.area();
        System.out.println("Площадь myarea2 равна " + ar);
//получить объем куба
        ar = mysqare.area();
        System.out.println("Площадь mysqare равна " + ar);
// получить объем клона
    }
}
