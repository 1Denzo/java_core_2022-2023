package LR6.Test8;

import java.util.stream.IntStream;

public class Test8 {
    int[] arr;
int set(int[] arr){
    this.arr = arr;
    int total = IntStream.of(arr).sum();
int avg = total / arr.length;
return avg;
}

}
