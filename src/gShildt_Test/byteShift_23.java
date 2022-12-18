package gShildt_Test;

public class byteShift_23 {
    //Сдвиг влево значения типа byte
    public static void main(String args[]) {
        byte а = 64, b;
        int i;
        i = а << 2;
        b = (byte) (а << 2);
        System.out.println("Пepвoнaчaльнoe значение а: " + а);
        System.out.println("i and b : " + i + " " + b);
    }
}
