package Arrays.LinearSearch;

import java.util.Arrays;

public class LinearSearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {43,56,46},
            {14,56,43,23,67},
            {45,34,78,45,45}
        };
        int target = 4;
        int[] ans = linearSearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] linearSearch(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
