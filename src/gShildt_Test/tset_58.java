package gShildt_Test;

public class tset_58 {
    int a, b;

    //Аргументы примитивных типов передаются по значению
    tset_58(int i, int j) {
        a = i;
        b = j;
    }

    //передать объект
    void meth(tset_58 о) {
        о.a *= 2;
        о.b /= 2;
    }
}
    class PassObjRe   {
    public static void main(String[] args) {
        tset_58 ob = new tset_58(15, 20);
        System.out.println("a и b до вызова: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("a и b после вызова: " + ob.a + " " + ob.b);
    }
}

