package coursework1;

import java.util.ArrayList;
import java.util.Scanner;

public class searchNode {

    public String searchString(String searchName) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение параметра " + searchName);
        String search = in.nextLine();
        return search;
    }

    public MotobikesList findLoopString(String twomenu, String searchname) {
        Parcer pars = new Parcer();
        MotobikesList motobikesList = pars.parsMotoXML();
        String mainName = motobikesList.getMainName();
        ArrayList<Motobike> parentList = motobikesList.getMotobikesList();
        ArrayList<Motobike> searchList = new ArrayList<>();
        switch (twomenu) {
            case "Vendor":
                for (int i = 0; i < parentList.size(); i++) {
                    if (parentList.get(i).getVendor().equals(searchname)) {
                        searchList.add(parentList.get(i));
                    }
                }
                break;
            case "Model":
                for (int i = 0; i < parentList.size(); i++) {
                    if (parentList.get(i).getModel().equals(searchname)) {
                        searchList.add(parentList.get(i));
                    }
                }
                break;
        }
        MotobikesList motobikesList1 = new MotobikesList(mainName, searchList);
        return motobikesList1;
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
                    for (int i = 0; i < parentList.size(); i++) {
                        if (parentList.get(i).getIdI() == param[0]) {
                            searchList.add(parentList.get(i));
                        }
                    }
                }
                    else {
                    for (int j = 0; j < parentList.size(); j++) {
                        if (parentList.get(j).getIdI() >= param[0]) {
                            if (parentList.get(j).getIdI() <= param[1]) {
                                searchList.add(parentList.get(j));
                            }
                        }
                    }
                }
                break;
            case "Age":
                if (param[1] == 0) {
                    for (int i = 0; i < parentList.size(); i++) {
                        if (parentList.get(i).getAgeShort() == param[0]) {
                            searchList.add(parentList.get(i));
                        }
                    }
                }
                else {
                    for (int j = 0; j < parentList.size(); j++) {
                        if (parentList.get(j).getAgeShort() >= param[0]) {
                            if (parentList.get(j).getIdI() <= param[1]) {
                                searchList.add(parentList.get(j));
                            }
                        }
                    }
                }
                break;
        }
        MotobikesList motobikesList1 = new MotobikesList(mainName, searchList);
        return motobikesList1;


    }
}