package LR10.Example1XML.ParcerXML;

import org.w3c.dom.NodeList;

import java.util.List;

public class Motobikes {
    private String name;
    private int id;
    private List<Motobike> motobikes;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMotobikes(List<Motobike> motobikes) {
        this.motobikes = motobikes;
    }

    public int getId() {
        return id;
    }

    public List<Motobike> getMotobikes() {
        return motobikes;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", " + motobikes;
    }
}