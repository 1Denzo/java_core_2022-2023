package gShildt_Test;

public class charSeeAll_5 {
    public static void main(String[] args) {
        char ch1;
        ch1 = 'A';
        System.out.println("ch1 содержит " + ch1);
        for (int i = 0; i < 6000; i++) {
            ch1++;
            System.out.println("ch1 теперь содержит " + ch1);
        }
    }
}
