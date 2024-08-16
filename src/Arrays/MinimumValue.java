package Arrays;

import java.util.Arrays;

public class MinimumValue {
    public static void main(String[] args) {
        int[] arr = {220,356,198,456,567};
        System.out.println(arr[0]);
        int check = arr[0];
        System.out.println(check);
        for (int i = 1; i < arr.length; i++) {
            if (check > arr[i]) {
                check = arr[i];
            }
        }
        System.out.println("The minimun value in given array "+ Arrays.toString(arr) + " is " + check);
    }
}
