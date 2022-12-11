package gShildt_Test;

public class lightSpeed_1 {
    public static void main(String[] args) {
        int lightSpeed;
        int days;
        long seconds;
        long distance;
        lightSpeed = 300_000; // Приблизительная скорость света в км/с
        days = 1000;
        seconds = days * 24 * 60 * 60; // Количество секунд в днях
        distance = lightSpeed * seconds; // Вычисление расстояния
        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около " + distance + " километров.");
    }
}
