package Arrays.BinarySearch;

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int ans = search(arr);
        System.out.println(ans);
    }
    static int search(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid+1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
