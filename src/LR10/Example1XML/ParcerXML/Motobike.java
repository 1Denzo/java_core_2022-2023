package LR10.Example1XML.ParcerXML;
public class Motobike {
    private String id;
    private String vendor;
    private String model;
    private String age;
    public void setId(int id) {
        this.id = Integer.toString(id);
    }
    public String getId() {
        return this.id;
    }
        public Short getIdI() {
            return Short.decode(this.id);
    }
    public String getVendor() {
        return vendor;
    }
    public String getModel() {
        return model;
    }
    public String getAge() {
        return this.age;
    }
    public Short getAgeShort() {
        return Short.valueOf(this.age);
    }
    public Motobike(int id, String vendor, String model, int age) {
        this.id = Integer.toString(id);
        this.vendor = vendor;
        this.model = model;
        this.age = Integer.toString(age);
    }
    public void setMoto(int id, String vendor, String model, int age) {
        this.id = Integer.toString(id);
        this.vendor = vendor;
        this.model = model;
        this.age = Integer.toString(age);
    }

    @Override
    public String toString() {
        return "{\"id\":" + "\"" + id + "\"" +
                ",\"vendor\":" + "\"" + vendor + "\"" +
                ",\"model\":" + "\"" + model + "\"" +
                ",\"age\":" + "\"" +  age + "\"" +
                "}";
    }
}

