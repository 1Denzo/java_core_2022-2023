package LR7.Ex3;

public class subB extends supA {
    public char j;

subB(int q, char w) {
    super(q);
    this.j = w;
}
void setJ(char o) {
    j = o;
}
void setAll(int p, char o){
    setN(p);
    j = o;
}
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " n = " + this.getN()+ "\n" +
                " str 2 = " + this.j;
        return ClassNameAndFieldValue;
    }

}