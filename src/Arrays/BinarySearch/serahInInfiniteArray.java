package Arrays.BinarySearch;

public class serahInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,6,7,8,9,9,9,9,9};
        int ans = findingRange(arr,9);
        System.out.println(ans);
    }
    static int findingRange(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(arr[end] < target) {
           int newStart = end + 1;
           end = end + (end - start + 1) * 2;
           start = newStart;
        }

        int ans = search(arr, target, start, end);
        return ans;
    }
    static int search (int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
       return -1;
    }
}
