package Arrays.BinarySearch;

import java.util.Arrays;

public class Question {
    public static void main(String[] args) {
        /* when we use binary search first when array is sorted..... */
        int[] arr = {2,3,5,9,14,16,18};
        int[] celingAns = Ceiling(arr, 15);
        int[] floorAns = floor(arr, 15);
        System.out.println(Arrays.toString(celingAns));
        System.out.println(Arrays.toString(floorAns));
    }

    static int[] Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return new int[] {arr[mid], mid};
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            }
        }
        return new int[] {arr[start], start};
    }

    static int[] floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return new int[] {arr[mid], mid};
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            }
        }
        return new int[] {arr[end], end};
    }
}
