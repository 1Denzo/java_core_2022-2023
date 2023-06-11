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
        String idS = this.id;
        return idS;
    }
        public Short getIdI() {
            Short idI = Short.decode(this.id);
            return idI;
    }
    public String getVendor() {
        return vendor;
    }
    public String getModel() {
        return model;
    }
    public String getAge() {
        String ageS = this.age;
        return ageS;
    }
    public Short getAgeShort() {
        Short ageShort = Short.valueOf(this.age);
        return ageShort;
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



   // public void Motobikes setBike(String vendor, String model, int age) {
   //    this.vendor = vendor;
  //      this.model = model;
  //      this.age = age;
  //  }

