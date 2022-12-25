package LR5;

public class Obj5 {
    private int k;
Obj5(int s) {
    k = s;
    if (s > 100)
        k = 100;
}
 Obj5() {
        k = 0;
    }
    int result(){
        int m = k;
        return m;
    }
}
class retu2 {
    public static void main(String[] args) {
        Obj5 ob1 = new Obj5(45);
        Obj5 ob2 = new Obj5(105);
        Obj5 ob3 = new Obj5();
        System.out.println(ob1.result()  +" "+ ob2.result() + " " + ob3.result());
    }
}