package Arrays.sorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = find(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] find(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                 swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        // search the missing number....
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j +1) {
                return new int[] {arr[j], j+1};
            }
        }
        return new int[] {-1, -1};
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
