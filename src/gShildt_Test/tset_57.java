package gShildt_Test;

class tset_57 {
    //Аргументы примитивных типов передаются по значению
        void meth(int i, int j) {
            i *= 2;
            j /= 2;
        }
    }
        class CallByValue {
            public static void main(String[] args) {
                tset_57 ob = new tset_57();
                int a = 15, b = 20;
                System.out.println("a и b до вызова: " + a + " " + b);
                ob.meth(a, b);
                System.out.println("a и b после вызова: " + a + " " + b);
            }
        }
