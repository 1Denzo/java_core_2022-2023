package LR7.Ex2;

public class superClass {
    private String str1;

    superClass() {
    }

    superClass(String strExt) {
        this.str1 = strExt;
    }
    void setStr1(String str){
        this.str1 = str;
    }

    public int getStr1() {

        return str1.length();
    }
}