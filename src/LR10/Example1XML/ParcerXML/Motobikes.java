package LR10.Example1XML.ParcerXML;


public class Motobikes extends Motobike {
    private String name;
    private int id;

    public Motobikes(String vendor, String model, int age) {
        super(vendor, model, age);
    }

    public Motobikes SetBike(String vendor, String model, int age) {
        Motobike setbike = new Motobike(vendor, model, age);
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
