package LR5;

public class Obj2 {
    char ch1 = 'A';
    char ch2 = 'K';
     int i = (int) ch1;
     int j = (int) ch2;
    void put() {
            for (i = (int) ch1;  i <= j; i++) {
                System.out.println("ch1 теперь содержит " + ch1);
                ch1++;
        }
    }
}
 class retu {
public static void main(String[]args){
    Obj2 ob1 = new Obj2();
   ob1.put();
        }
}
