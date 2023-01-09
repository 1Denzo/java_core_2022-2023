package LR6.Test2;

public class Test2 {
    private static int k;
     static int getNum() {
        return k++;
    }
}
class testWiew {
    public static void main(String[] args) {
        Test2 obj1 = new Test2();
        int w, e, r;
        w = obj1.getNum();
        System.out.println(w);
        e = obj1.getNum();
        System.out.println(e);
        r = obj1.getNum();
        System.out.println(r);
    }
}
