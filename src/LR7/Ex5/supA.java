package LR7.Ex5;

public class supA {
    protected String txt;
    supA(String k) {
        this.txt = k;
    }
    public String getTxt() {
        return this.txt;
    }
    public void setStr(String str1) {
        this.txt = str1;
    }

    public String toString() {
            String superClassNameAndFieldValue;
            superClassNameAndFieldValue = "super" + "\n" +
                    " Class name: " + this.getClass().getSimpleName() + "\n" +
                    " txt = " + this.getTxt();
            return superClassNameAndFieldValue;
    }
}
