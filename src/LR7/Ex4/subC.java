package LR7.Ex4;
    public class subC extends subB implements Cloneable {
        public int num;
        void setAll(char t, String y, int u) {
            setAll(t, y);
            num = u;
        }
        subC(char x, String y, int z){
            super(x, y);
            this.num = z;
        }
        public subC clone() throws CloneNotSupportedException {
            System.out.println("Клон subC создан ");
            return (subC) super.clone();
        }
        int getNum(){
            return num;
        }
    }

