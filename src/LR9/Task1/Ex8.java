package LR9.Task1;

public class Ex8 {
    public class Main {
        public int m() {
            try {
                System.out.println("0");
                throw new RuntimeException();
            } finally {
                System.out.println("1");
            }
        }
        public Main(String[] args) {
            System.out.println(m());
        }
    }
}
