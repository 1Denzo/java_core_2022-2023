package LR10.Example2JSON;

import java.util.ArrayList;

public class MotobikesList1 {
    private String MainName;
    private ArrayList<Motobike1> motobikesList;
    public MotobikesList1(String MainName, ArrayList motobikesList) {
        this.MainName = MainName;
        this.motobikesList = motobikesList;
    }
    public String getMainName() {
        return MainName;
    }
    public ArrayList<Motobike1> getMotobikesList() {
        return motobikesList;
    }
    @Override
    public String toString() {
        return "MotobikesList1{" + MainName + '\'' + motobikesList + '}';
    }
}

