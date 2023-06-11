package coursework1;

import java.util.ArrayList;

public class MotobikesList {
    private String MainName;
    private ArrayList<Motobike> motobikesList;
    public MotobikesList(String MainName, ArrayList motobikesList) {
        this.MainName = MainName;
        this.motobikesList = motobikesList;
    }
    public String getMainName() {
        return MainName;
    }
    public ArrayList<Motobike> getMotobikesList() {
        return motobikesList;
    }
    @Override
    public String toString() {
        return "MotobikesList{" +
                "MainName='" + MainName + '\'' + motobikesList + '}';
    }
}

