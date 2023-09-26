package LR13;
/*Напишите программу, которая создает 10 потоков и каждый
 поток выводит на экран свой номер.*/
public class Exercise4 {
    public void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new NumThread(i);
            thread.start();
            thread.join();
        }
    }

    class NumThread extends Thread {
        private int number;

        public NumThread(int number) {
            this.number = number;
        }

        public void run() {
            System.out.println("Поток " + number + " выполняется.");
        }
    }
}
