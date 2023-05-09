package LR10.Example1XML.ParcerXML;

public class Motobike {
    private String vendor;
    private String model;
    private int age;

    public Motobike(String vendor, String model, int age) {
        this.vendor = vendor;
        this.model = model;
        this.age = age;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Motobike{" +
                "vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
