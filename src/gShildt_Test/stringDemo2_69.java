package gShildt_Test;

public class stringDemo2_69 {
    // Продемонстрировать некоторые методы из класса String
    public static void main(String args[]) {
        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strObЗ = strOb1;
        System.out.println("Длина строки strOb1: " + strOb1.length());
        System.out.println("Cимвoл по индексу З в строке strOb1: " + strOb1.charAt(3));
        if (strOb1.equals(strOb2))
            System.out.println("strob1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");
        if (strOb1.equals(strObЗ))
            System.out.println("strOb1 == strObЗ");
        else
            System.out.println("strOb1 != strOb3");
    }
}

