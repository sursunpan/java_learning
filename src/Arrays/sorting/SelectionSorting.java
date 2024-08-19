package Arrays.sorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
     }
    static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the maximum item in remaning array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
