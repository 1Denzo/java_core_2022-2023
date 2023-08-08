package coursework1;

import LR10.Example2JSON.JsonParcer;
import LR10.Example2JSON.Motobike1;
import LR10.Example2JSON.MotobikesList1;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ReWriteNode {
    public static MotobikesList1 reWriteNode(int idReWriteNode) throws ParseException, IOException {
        LR10.Example2JSON.JsonParcer parcer = new JsonParcer();
        MotobikesList1 motobikesList = parcer.parsJson();
        String mainName = motobikesList.getMainName();
        Scanner in = new Scanner(System.in);
        String inVend, inModel;
        int inAge, inAgeI;
        LocalDate date = LocalDate.now(); // получаем текущую дату
        int year = date.getYear();
        ArrayList<Motobike1> parent = motobikesList.getMotobikesList();
                System.out.println("Введите название фирмы-изготовителя мотоцикла " + idReWriteNode + ":");
                inVend = in.next();
                System.out.println("Введите название модели мотоцикла " + idReWriteNode + ":");
                inModel = in.next();
                System.out.println("Введите год выпуска мотоцикла " + idReWriteNode + ":");
                inAgeI = in.nextInt();
                inAge = (year - inAgeI);
                parent.get(idReWriteNode-1).setMoto(Integer.toString(inAge), inVend, inModel, Integer.toString(inAge));
        return new MotobikesList1(mainName, parent);
    }
}
