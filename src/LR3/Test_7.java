package LR3;

public class Test_7 {
    public static void main(String[] args) {
        int size = 10;
        char[] array = new char[size];
        char ch = 'A';
        for (int i = 0; i < size; i++) {
            array[i] = ch;
            System.out.println(array[i]);
            ch++;
            ch++;
        }
        for (int i = size-1; i >= 0; i--) {
            System.out.println(array[i]);
                    }
    }
}
