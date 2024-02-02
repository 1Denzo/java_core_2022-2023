package coursework1;
public class Motobike {
    private int id;
    private String vendor;
    private String model;
    private int age;
    public void setId(int id) {
        this.id = id;
    }
    public String getId() {
        return Integer.toString(id);
    }
        public Short getIdI() {
            return (Short) (short) this.id;
    }
    public String getVendor() {
        return vendor;
    }
    public String getModel() {
        return model;
    }
    public String getAge() {
        return Integer.toString(age);
    }
    public Short getAgeShort() {
        return (Short) (short) this.age;
    }
    public Motobike(int id, String vendor, String model, int age) {
        this.id = id;
        this.vendor = vendor;
        this.model = model;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Motobike{" +
                "id=" + id +
                ", vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                '}';
    }
}



   // public void Motobikes setBike(String vendor, String model, int age) {
   //    this.vendor = vendor;
  //      this.model = model;
  //      this.age = age;
  //  }

