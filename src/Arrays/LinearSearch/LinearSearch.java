package Arrays.LinearSearch;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        /* for linear search best time complexity is o(1) and worst case is o(n)
         * The best case is when element at 0th index...
         * The worst case is not found item in the array
         */
       
         int[] arr = {23,45,67,78,54,7,54,45};
         int target1 = 60;
         int res1 = linearSearch(arr,target1);


         System.out.println("The index of "+ target1 + " in " + Arrays.toString(arr) + " is "+ res1 );

         String str = "Suraj Pandey";
         char target2 = 'u';

         System.out.println("In String "+ str + " char u is present " + SearchInString(str, target2));
         System.out.println(SerachInRange(arr,4,7,7));
    }
    /* Search in the array: return the index if item found
     * ohterwise if item not found return -1
     */
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        if (arr[0] == target) {
            return 0;
        }
        for (int i=1; i<arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static boolean SearchInString(String str, char target) {
           if (str.length() == 0) {
            return false;
           }


           if (str.charAt(0) == target) {
            return true;
          }


           for (int i=1; i<str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }}

            // or
           for(char ch: str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        
        return false;
    }

    static int SerachInRange(int[] arr, int start, int end, int target) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
