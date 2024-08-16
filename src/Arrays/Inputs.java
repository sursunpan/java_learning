package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    // array of primitive....
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 10;
        arr[3] = 90;
        arr[4] = 100;
        // arr[5] = 87;

        System.out.println(arr[0]);

        for (int i =0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        /*
         * Enhanced for loop....
         */

         for (int num: arr) {
            System.out.print(num + " "); // here num represent elements of array.....
         }

         System.out.println(Arrays.toString(arr));


         // array of objects....
         String[] str = new String[4];
         for (int i=0; i< str.length; i++) {
            str[i] = in.next();
         }

         System.out.println(Arrays.toString(str));
     }
}
