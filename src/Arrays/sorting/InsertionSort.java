package Arrays.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        InsertionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void InsertionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                 if (arr[j] > arr[j-1]) {
                    break;
                 } else {
                    swap(arr, j, j-1);
                 }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
