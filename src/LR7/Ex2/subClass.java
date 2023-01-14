package LR7.Ex2;

public class subClass extends superClass {

   public int num;

   subClass(String strE, int num2) {
      setStr1(strE);
      num = num2;
   }
   void setNum(int num3){
         setStr1("");
         num = -1;
      }
    void setStrExt(String strExt){
      setStr1(strExt);
      num = -1;
      }
      void setAll(String str, int n) {
      setStr1(str);
      n = num;
      }
      int showStr() {
          return getStr1();
      }
          int   getNum(){
       return num;
      }
}
