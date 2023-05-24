package LR10.Example1XML.ParcerXML;


public class Motobike {

    private int id;
    private String vendor;
    private String model;
    private int age;

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

    @Override
    public String toString() {
        return  "{id=" + id +
                ", vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                '}';
    }



   // public void Motobikes setBike(String vendor, String model, int age) {
   //    this.vendor = vendor;
  //      this.model = model;
  //      this.age = age;
  //  }


    public void setId(int id) {
        this.id = id;
    }
}
