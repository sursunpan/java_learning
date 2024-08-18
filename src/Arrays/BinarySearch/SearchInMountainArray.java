package Arrays.BinarySearch;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = Peak(arr);
        int IncreasingSearch = IncreasingSearch(arr, target, 0, peak);
        int ans = 0;
        if (IncreasingSearch != -1) {
          ans = IncreasingSearch(arr, target, 0, peak);
        } else {
          ans = decreasingSearch(arr, target, peak, arr.length);
        }
        System.out.println(ans);
    }
    static int Peak(int arr[]) {
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

    static int IncreasingSearch(int arr[], int target, int start, int end) {
        while (start <= end) {
             int mid = start + (end - start) / 2;  
             if (arr[mid] == target) {
                return mid;
             } 
             if (arr[mid] > target) {
                end = mid - 1;
             } else if (arr[mid] < target) {
                start = mid + 1;
             }    
        }
        return -1;
    }

    static int decreasingSearch(int arr[], int target, int start, int end) {
        while (start <= end) {
             int mid = start + (end - start) / 2;  
             if (arr[mid] == target) {
                return mid;
             } 
             if (arr[mid] > target) {
                start = mid + 1;
             } else if (arr[mid] < target) {
                end = mid - 1;
             }    
        }
        return -1;
    }
}
