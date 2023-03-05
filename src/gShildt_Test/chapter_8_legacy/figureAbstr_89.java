package gShildt_Test.chapter_8_legacy;

abstract class figureAbstr_89 {
    // Применение абстрактных методов и классов
        double dim1;
        double dim2;

        figureAbstr_89(double a, double b) {
            dim1 = a;
            dim2 = b;
        }
        abstract double area(); //Теперь метод area обьявляется абстрактным
    }
    class Rectangle2 extends figureAbstr_89 {
        Rectangle2(double a, double b) {
            super(a, b);
        }

        //переопределить метод area() для четырехугольника
        double area() {
            System.out.println("B области четырехугольника.");
            return dim1 * dim2;
        }
    }
    class Triangle2 extends figureAbstr_89 {
        Triangle2(double a, double b) {
            super(a, b);
        }

        // переопределить метод area() для
        // прямоугольного треугольника
        double area() {
            System.out.println("B области треугольника.");
            return dim1 * dim2 / 2;
        }
    }
    class abstractAreas {
        public static void main(String[] args) {
            //Figure f = new Rectangle2(9, 5);
            Rectangle2 r = new Rectangle2(9, 5);
            Triangle2 t = new Triangle2(10, 8);
            figureAbstr_89 figref;
            figref = r;
            System.out.println("Плoщaдь равна " + figref.area());
            figref = t;
            System.out.println("Плoщaдь равна " + figref.area());
        }
    }
