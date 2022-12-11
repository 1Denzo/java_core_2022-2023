package LR3;

public class Test_8 {
    public static void main(String[] args) {
                int size = 10;
                char[] array = new char[size];
                char ch = 'A';
                for (int i = 0; i < size; i++) {
                    ch++;
                    switch (ch) {
                        case 'A':
                            break;
                        case 'E':
                            break;
                        case 'I':
                            break;
                        case 'O':
                            break;
                        case 'U':
                            break;
                        default:
                            array[i] = ch;
                    System.out.println("Согласная буква номер " + (i+1) + " - "+array[i]);
                    }
                }
                }
            }