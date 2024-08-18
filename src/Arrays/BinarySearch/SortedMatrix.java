package Arrays.BinarySearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 10)));
    }
    static int[] BinarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart)/2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid -1;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return BinarySearch(matrix, 0, 0, cols - 1, target);
        }
        int rstart = 0;
        int rend = rows -1;
        int cmid = cols/2;  
        while(rstart < (rend - 1)) {
            int mid = rstart + (rend - rstart) /2;
            if (matrix[mid][cmid] > target ) {
                return new int[]{mid, cmid};
            }
            if (matrix[mid][cmid] < target) {
                rstart = mid;
            } else {
                rend = mid;
            }
        }

        // now we have two rows
        // check wheather the target is in the col of 2 rows

        if (matrix[rstart][cmid] == target) {
            return new int[]{rstart, cmid};
        }
        if (matrix[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1, cmid};
        }

        // check for 4 case
        if (target <= matrix[rstart][cmid - 1]) {
           return BinarySearch(matrix, rstart, 0, cmid -1, target);
        }
         if (target >= matrix[rstart][cmid + 1] && target <= matrix[rstart][cols -1]) {
            return BinarySearch(matrix, rstart, cmid+1, cmid-1, target);
        }
         if (target <= matrix[rstart + 1][cmid - 1]) {
            return BinarySearch(matrix, rstart+ 1,0, cmid-1, target);
        }
        else {
            return BinarySearch(matrix, rstart+1, cmid+1, cols-1, target);
        }
    }
}
