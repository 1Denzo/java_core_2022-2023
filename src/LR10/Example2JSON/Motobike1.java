package LR10.Example2JSON;
public class Motobike1 {
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
    public Motobike1(String id, String vendor, String model, String age) {
        this.id = id;
        this.vendor = vendor;
        this.model = model;
        this.age = age;
    }
   /* public void setMoto(String id, String vendor, String model, String age) {
        this.id = id;
        this.vendor = vendor;
        this.model = model;
        this.age = age;
    }*/
    @Override
    public String toString() {
        return "{\"id\":" + "\"" + id + "\"" +
                ",\"vendor\":" + "\"" + vendor + "\"" +
                ",\"model\":" + "\"" + model + "\"" +
                ",\"age\":" + "\"" +  age + "\"" +
                "}";
    }
}
   // public void Motobikes setBike(String vendor, String model, int age) {
   //    this.vendor = vendor;
  //      this.model = model;
  //      this.age = age;
  //  }

