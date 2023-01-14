package LR7.Ex5;

public class subC extends supA {
    protected char ch;

    subC(String k, char c) {
        super(k);
        this.ch = c;
    }

    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " Txt = " + this.getTxt() +
                " Char = " + this.ch;
        return superClassNameAndFieldValue;
    }
}