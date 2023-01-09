package LR6.Test1;

public class Test1 {
    char tx;
    String str;

    public void set(char tx) {
        this.tx = tx;
        System.out.println("Символьное поле: " + tx);
    }

    public void set(String str) {
        this.str = str;
        System.out.println("Текстовое поле: " + str);
    }

    public void set(char[] ar) {
            if (ar.length == 1) {
                this.tx = ar[0];
                System.out.println("Символьное поле: " + ar[0]);
            }
            else if (ar.length > 1) {
                str = String.valueOf(ar);
            System.out.println("Текстовое поле: " + str);
        }
    }
}


