package Arrays.sorting;

import java.util.Arrays;

public class CyclicSorting {
    public static void main(String[] args) {
        int[] arr = {6,4,1,3,2,5};
        CylceSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void CylceSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else {
                i++;
            }
            
        }
    }
        static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
