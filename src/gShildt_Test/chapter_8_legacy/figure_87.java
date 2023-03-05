package gShildt_Test.chapter_8_legacy;

class figure_87 {
    // Применение динамического полиморфизма
    double dim1;
    double dim2;

    figure_87(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Плoщaдь фигуры не определена.");
        return 0;
    }
}
            class Rectangle extends figure_87 {
                Rectangle(double a, double b) {
                    super(a, b);
                }

                //переопределить метод area() для четырехугольника
                double area() {
                    System.out.println("B области четырехугольника.");
                    return dim1 * dim2;
                }
            }
                        class Triangle extends figure_87 {
                            Triangle(double a, double b) {
                                super(a, b);
                            }

                            // переопределить метод area() для
                            // прямоугольного треугольника
                            double area() {
                                System.out.println("B области треугольника.");
                                return dim1 * dim2 / 2;
                            }
                        }
                                    class FindAreas {
                                        public static void main(String[] args) {
                                            figure_87 f = new figure_87(10, 10);
                                            Rectangle r = new Rectangle(9, 5);
                                            Triangle t = new Triangle(10, 8);
                                            figure_87 figref;
                                            figref = r;
                                            System.out.println("Плoщaдь равна " + figref.area());
                                            figref = t;
                                            System.out.println("Плoщaдь равна " + figref.area());
                                            figref = f;
                                            System.out.println("Плoщaдь равна " + figref.area());
                                        }
                                    }
