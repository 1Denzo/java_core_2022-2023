package LR7.Ex4;

    public class subB extends supA implements Cloneable {
        public String j;

        subB(char q, String w) {
            super(q);
            this.j = w;
        }
        public subB clone() throws CloneNotSupportedException {
            System.out.println("Клон subB создан ");
            return (subB) super.clone();
        }
        void setJ(String o) {
            j = o;
        }
        void setAll(char p, String o){
            setN(p);
            j = o;
        }
        String getJ(){
            return j;
        }
    }
