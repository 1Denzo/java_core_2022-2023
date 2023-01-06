package gShildt_Test;

public class staticDemo_65 {
    static int a = 42;
    static int b = 99;

    static void callme() {
        System.out.println("a = " + a);
    }
}
        class StaticByName {

            public static void main(String args[]) {
                staticDemo_65.callme();
                System.out.println("b = " + staticDemo_65.b);
            }
        }