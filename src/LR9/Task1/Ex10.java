package LR9.Task1;

public class Ex10 {
    public class Main {
        public int m() {
            try {
                System.out.println("0");
                return 15;
            } finally {
                System.out.println("1");
                return 20;
            }
        }

        public void main(String[] args) {
            System.out.println(m());
        }
    }
}
