package LR5;

public class Obj6 {
    private int max = 8;
    private int min = 3;
    Obj6(int i, int j) {
        if (i > j && i > max ) { // Нахождение максимального предела
            max = i;
        }
        else if (j > i && j > max) { // Нахождение максимального предела
            max = j;
        } else if (i < j && i < min) { //Нахождение минимального минимума
            min = i;
        } else if (j < i && j < min) { //Нахождение минимального минимума
            min = j;
        }
        }
    Obj6(int k) {
        if (k > max) {
            max = k;
        } else if (k < min) {
            min = k;
        }
    }
            void show() {
                System.out.println(max + " " + min); //Вывод интервала в консоль
            }
        }
        class showme {
            public static void main(String[] args) {
                Obj6 ob1 = new Obj6(5, 45);
                Obj6 ob2 = new Obj6(1, 3);
                Obj6 ob3 = new Obj6(1);
                ob1.show();
                ob2.show();
                ob3.show();
            }
            }

