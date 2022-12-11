package gShildt_Test;
// Продемонстрировать область видимости блока кода
public class scope_8 {
    public static void main(String[] args) {
        int x; // Эта переменная доступна всему коду из метода main
        x = 10;
        if (x == 10) { // Начало новой области видимости, доступной только этому блоку кода
            int y = 20;  // Обе переменные x и y доступны в этой области действия
            System.out.println("x и y " + x + " " + y);
            x = y * 2;
        }
            //y = 100; //ОШИБКА! переменная Y недоступна в этой области действия
            System.out.println("x равно " + x); // Переменная x доступна и здесь
        }
    }
