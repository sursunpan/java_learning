package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class MultidemiArray {
@SuppressWarnings("unused")
public static void main(String[] args) {
    /*  
     * 1 2 3
     * 4 5 6
     * 7 8 4
     */
     @SuppressWarnings("resource")
   Scanner in = new Scanner(System.in);
     int[][] arr = new int[3][]; // rows mandatory but columns not mandatory

     int[][] matrix = {
        {1,2,3}, // oth index
        {4,5}, // 1st index
        {6,7,8,9} // 2nd index
     };

     // input
     int[][] array2d = new int[3][3];
     for (int i = 0; i < array2d.length; i++) {
        for (int j = 0; j < array2d[i].length; j++) {
            array2d[i][j] = in.nextInt();
        }
     }

     for (int i = 0; i < array2d.length; i++) {
        System.out.println(Arrays.toString(array2d[i]));
     }

     for (int[] a: array2d) {
          System.out.println(Arrays.toString(a));
     }
} 
}