package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        // INITILISATION
        for (int i = 0; i < 3; i++) {
            matrix.add(new ArrayList<>());
        }

        // ADD ELEMENTS

       for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
             matrix.get(i).add(in.nextInt());
          }
       }

       // get element
       System.out.println(matrix);
    }
}
