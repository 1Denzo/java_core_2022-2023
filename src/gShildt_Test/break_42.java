package gShildt_Test;

public class break_42 {
    //Применение оператора break в качестве цивилизованной
//формы оператора goto
        public static void main(String[] args) {
            boolean t = true;
            {
                second:
                {
                    {
                        System.out.println(
                                "Предшествует оператору break.");
                        break second; // выход из блока second
                    }
                }
                System.out.println(
                        "Этот оператор следует за блоком second.");
            }
            }
        }