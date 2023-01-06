package gShildt_Test;

public class objToMetod_55 {
    // Объекты допускается передавать методам в качестве параметров
    int a, b;

    objToMetod_55(int i, int j) {
        a = i;
        b = j;
    }

    // возвратить логическое значение true, если в
// качестве параметра о указан вызывающий объект
    boolean equalTo(objToMetod_55 o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}
            class PassOb {
                public static void main(String[] args) {
                    objToMetod_55 ob1 = new objToMetod_55(100, 22);
                    objToMetod_55 ob2 = new objToMetod_55(100, 22);
                    objToMetod_55 ob3 = new objToMetod_55(-1, -1);
                    System.out.println("ob1 == оb1: " + ob1.equals(ob1));
                    System.out.println("ob1 == оb2: " + ob1.equals(ob2));
                    System.out.println("ob1 == оb3: " + ob1.equals(ob3));

                }
            }
