package LR10.Example1XML.ParcerXML;

import java.util.ArrayList;

public class MotobikesList {
    private String MainName;
    private ArrayList<Motobike> motobikesList;

    public MotobikesList(String MainName, ArrayList motobikesList) {
        this.MainName = MainName;
        this.motobikesList = motobikesList;
    }

    @Override
    public String toString() {
        return
                "MainName='" + MainName + '\'' +
                ", motobikesList=" + motobikesList;
    }
//public void addMotobike(Motobike motobike) {
    //    motobikesList.addMotobike(motobike);
    //}

}

