package gShildt_Test;

public class commandLine_71 {
    // Вывести все аргументы командной строки
        public static void main ( String args []) {
            for(int i=0; i<args.length; i++)
                System.out.println("args[" + i + "]: "+ args[i]);
        }
}
