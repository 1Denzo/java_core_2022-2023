package LR7.Ex5;

public class subB extends supA {
    protected int num;

    subB(String tx, int n) {
        super(tx);
        this.num = n;
    }

    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " Txt = " + this.getTxt() +
                " Num = " + this.num;
        return superClassNameAndFieldValue;
    }
}
