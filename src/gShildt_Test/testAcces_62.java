package gShildt_Test;

public class testAcces_62 {
    /* В этой программе демонстрируется отличие
модификаторов public и private.
*/
    int а; // доступ, определяемый по умолчанию
    public int b;// открытый доступpublic int Ь;
    private int с; // закрытый доступ

    // методы доступа к члену с данного класса
    void setc(int i) {
//установить значение члена с данного класса
        с = i;
    }

    int getc() {
//получить значение члена с данного класса
        return с;
    }
}
            class AccessTest {
                public static void main(String[] args) {

                    testAcces_62 ob = new testAcces_62();
//Эти операторы правильны, поэтому члены а и b
//данного класса доступны непосредственно
                    ob.а = 10;
                    ob.b = 20;
// Этот оператор неверен и может вызвать ошибку
// оb.с = 100; //ОШИБКА!
//Доступ к члену с данного класса должен
// осуществляться с помощью методов его класса
                    ob.setc(100); //ВЕРНО!
                    System.out.println("a, b, и с: " + ob.а + " "
                            + ob.b + " " + ob.getc());

                }
            }
