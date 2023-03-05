package LR9.Task1;

public class Ex9 {
    public class Main {
    public int m() {
        try {
            System.out.println("0");
            return 55;    // выход из метода
        } finally {
            System.out.println("1");
        }
    }

    private void main(String[] args) {
        System.out.println(m());
    }
}
}
