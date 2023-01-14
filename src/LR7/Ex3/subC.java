package LR7.Ex3;

public class subC extends subB{
    public String txt;
    void setAll(int t, char y, String u) {
        setAll(t, y);
        txt = u;
    }
        subC(int x, char y, String z){
            super(x, y);
            this.txt = z;
        }
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getN() + "\n" +
                " str 2 = " + this.j + "\n" +
                " str 3 = " + this.txt;
        return ClassNameAndFieldValue;
    }

}
