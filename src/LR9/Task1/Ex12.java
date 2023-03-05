package LR9.Task1;

public class Ex12 {
    public class Main {
        private void m(String str, double chislo) {
            if (str == null) {
                throw new IllegalArgumentException("Строка введена неверно");
            }
            if (chislo > 0.001) {
                throw new IllegalArgumentException("Неверное число");
            }
        }

        public void main(String[] args) {
            m(null, 0.000001);
        }
    }
}
