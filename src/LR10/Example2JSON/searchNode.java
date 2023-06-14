package LR10.Example2JSON;

import org.json.simple.parser.ParseException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class searchNode {

    public String searchString(String searchName) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение параметра " + searchName);
        return in.nextLine();
    }

    public MotobikesList1 findLoopString(String twomenu, String searchname) throws ParseException, IOException {
        JsonParcer pars = new JsonParcer();
        MotobikesList1 motobikesList = pars.parsJson();
        String mainName = motobikesList.getMainName();
        ArrayList<Motobike1> parentList = motobikesList.getMotobikesList();
        ArrayList<Motobike1> searchList = new ArrayList<>();
        switch (twomenu) {
            case "Vendor":
                for (Motobike1 motobike1 : parentList) {
                    if (motobike1.getVendor().equals(searchname)) {
                        searchList.add(motobike1);
                    }
                }
                break;
            case "Model":
                for (Motobike1 motobike1 : parentList) {
                    if (motobike1.getModel().equals(searchname)) {
                        searchList.add(motobike1);
                    }
                }
                break;
        }
        return new MotobikesList1(mainName, searchList);
    }
    public MotobikesList1 findLoopNum(String twomenu, short [] param) throws ParseException, IOException {
        JsonParcer pars = new JsonParcer();
        MotobikesList1 motobikesList = pars.parsJson();
        String mainName = motobikesList.getMainName();
        ArrayList<Motobike1> parentList = motobikesList.getMotobikesList();
        ArrayList<Motobike1> searchList = new ArrayList<>();
        switch (twomenu) {
            case "id":
                if (param[1] == 0) {
                    for (Motobike1 motobike1 : parentList) {
                        if (motobike1.getIdI() == param[0]) {
                            searchList.add(motobike1);
                        }
                    }
                }
                    else {
                    for (Motobike1 motobike1 : parentList) {
                        if (motobike1.getIdI() >= param[0]) {
                            if (motobike1.getIdI() <= param[1]) {
                                searchList.add(motobike1);
                            }
                        }
                    }
                }
                break;
            case "Age":
                if (param[1] == 0) {
                    for (Motobike1 motobike1 : parentList) {
                        if (motobike1.getAgeShort() == param[0]) {
                            searchList.add(motobike1);
                        }
                    }
                }
                else {
                    for (Motobike1 motobike1 : parentList) {
                        if (motobike1.getAgeShort() >= param[0]) {
                            if (motobike1.getIdI() <= param[1]) {
                                searchList.add(motobike1);
                            }
                        }
                    }
                }
                break;
        }
        return new MotobikesList1(mainName, searchList);
    }
}