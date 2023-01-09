package LR6.Test10;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
int[] arrayInt = getMaxMinNum(17343, 13874, 3452, 453);
        System.out.println(Arrays.toString(arrayInt));
    }
    public static int[] getMaxMinNum(int ... v) {
        Arrays.sort(v);
        int[] arrayInt = new int[2];
        arrayInt[0] = v[0];
        arrayInt[1] = v[v.length -1];
        return arrayInt;
    }
}
