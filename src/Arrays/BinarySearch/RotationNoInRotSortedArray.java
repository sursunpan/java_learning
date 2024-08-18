package Arrays.BinarySearch;

public class RotationNoInRotSortedArray {
    public static void main(String[] args) {
         int[] arr = {7,9,11,12,5};
        System.out.println(Count(arr) + 1);
    }

    static int Count(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
           int mid = start + (end - start)/2;
           if (mid < end && arr[mid] > arr[mid+1]) {
            return mid;
           }
           if (mid > start && arr[mid -1] > arr[mid]) {
             return mid -1;
           }

           if (arr[start] >= arr[mid]) {
            end = mid -1;
           } else {
            start = mid + 1;
           }
        }
        return -1;
    }
}
