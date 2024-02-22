package gShildt_Test;

public class byteShift_23 {
    //Сдвиг влево значения типа byte
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Пepвoнaчaльнoe значение а: " + a);
        System.out.println("i and b : " + i + " " + b);
    }
}
