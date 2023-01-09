package LR6.Test9;

public class Test9 {
    static void Sort(char[] arr){
        {
            for (int i = 0; i < arr.length / 2; i++)
            {
                char temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
        }

    }}