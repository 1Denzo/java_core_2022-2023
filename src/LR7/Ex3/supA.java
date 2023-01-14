package LR7.Ex3;

public class supA {
   public int n;
   supA(int p){
       n = p;
   }
    void setN(int n1) {
        this.n = n1;
    }
    int getN() {
        return n;
    }
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " n = " + this.getN();
        return ClassNameAndFieldValue;
    }
    }
