package LR10.Example1XML.ParcerXML;


public class Motobike {

    private int id;
    private String vendor;
    private String model;
    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public String getId() {
        String idS = Integer.toString(id);
        return idS;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public String getAge() {
        String ageS = Integer.toString(age);
        return ageS;
    }

    public Motobike(int id, String vendor, String model, int age) {
        this.id = id;
        this.vendor = vendor;
        this.model = model;
        this.age = age;
    }

    public void setMoto(int id, String vendor, String model, int age) {
        this.id = id;
        this.vendor = vendor;
        this.model = model;
        this.age = age;
    }

    public String toString(int id) {
        return "Motobike{" +
                "id=" + this.id +
                ", vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                '}' + "\n";
    }
}



   // public void Motobikes setBike(String vendor, String model, int age) {
   //    this.vendor = vendor;
  //      this.model = model;
  //      this.age = age;
  //  }

