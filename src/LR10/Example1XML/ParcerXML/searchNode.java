package LR10.Example1XML.ParcerXML;

import java.util.ArrayList;
import java.util.Scanner;

public class searchNode {

    public String searchString(String searchName) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение параметра " + searchName);
        return in.nextLine();
    }

    public MotobikesList findLoopString(String twomenu, String searchname) {
        Parcer pars = new Parcer();
        MotobikesList motobikesList = pars.parsMotoXML();
        String mainName = motobikesList.getMainName();
        ArrayList<Motobike> parentList = motobikesList.getMotobikesList();
        ArrayList<Motobike> searchList = new ArrayList<>();
        switch (twomenu) {
            case "Vendor":
                for (Motobike motobike : parentList) {
                    if (motobike.getVendor().equals(searchname)) {
                        searchList.add(motobike);
                    }
                }
                break;
            case "Model":
                for (Motobike motobike : parentList) {
                    if (motobike.getModel().equals(searchname)) {
                        searchList.add(motobike);
                    }
                }
                break;
        }
        return new MotobikesList(mainName, searchList);
    }
    public MotobikesList findLoopNum(String twomenu, short [] param) {
        Parcer pars = new Parcer();
        MotobikesList motobikesList = pars.parsMotoXML();
        String mainName = motobikesList.getMainName();
        ArrayList<Motobike> parentList = motobikesList.getMotobikesList();
        ArrayList<Motobike> searchList = new ArrayList<>();
        switch (twomenu) {
            case "id":
                if (param[1] == 0) {
                    for (Motobike motobike : parentList) {
                        if (motobike.getIdI() == param[0]) {
                            searchList.add(motobike);
                        }
                    }
                }
                    else {
                    for (Motobike motobike : parentList) {
                        if (motobike.getIdI() >= param[0]) {
                            if (motobike.getIdI() <= param[1]) {
                                searchList.add(motobike);
                            }
                        }
                    }
                }
                break;
            case "Age":
                if (param[1] == 0) {
                    for (Motobike motobike : parentList) {
                        if (motobike.getAgeShort() == param[0]) {
                            searchList.add(motobike);
                        }
                    }
                }
                else {
                    for (Motobike motobike : parentList) {
                        if (motobike.getAgeShort() >= param[0]) {
                            if (motobike.getIdI() <= param[1]) {
                                searchList.add(motobike);
                            }
                        }
                    }
                }
                break;
        }
        return new MotobikesList(mainName, searchList);


    }
}