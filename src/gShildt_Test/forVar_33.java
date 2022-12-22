package gShildt_Test;

public class forVar_33 {
    //Отдельные части оператора цикла for могут отсутствовать
    public static void main(String args[]) {
        int i;
        boolean done = false;
        i = 0;
        for (; !done; ) {
            System.out.println("i равно " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}