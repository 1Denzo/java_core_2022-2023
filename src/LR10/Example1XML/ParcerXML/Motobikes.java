package LR10.Example1XML.ParcerXML;


public class Motobikes {
    private String name;
    private int id;
    private String vendor;
    private String model;
    private int age;

    @Override
    public String toString() {
        return "Motobikes{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                '}';
    }

    public Motobikes(String name, int id, String vendor, String model, int age) {
        this.name = name;
        this.id = id;
        this.vendor = vendor;
        this.model = model;
        this.age = age;
    }

   // public void Motobikes setBike(String vendor, String model, int age) {
   //    this.vendor = vendor;
  //      this.model = model;
  //      this.age = age;
  //  }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
