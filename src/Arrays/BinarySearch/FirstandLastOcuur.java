package Arrays.BinarySearch;

import java.util.Arrays;

public class FirstandLastOcuur {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = search(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[] arr, int target) {
        int[] ans = {-1,-1};
        int firstOccurence = indexes(arr, target, true);
        int lastOcuurennce = indexes(arr, target, false);
        
        ans[0] = firstOccurence;
        ans[1] = lastOcuurennce;
        return ans;
    }

    static int indexes(int[] arr, int target, boolean findFirstIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
           int mid = start + (end - start) / 2;
           if (target < arr[mid]) {
            end = mid - 1;
           } else if (target < arr[mid]) {
            start = mid + 1;
           } else {
             ans = mid;
             if (findFirstIndex) {
                end = mid - 1;
             } else {
                start = mid + 1;
             }
           }
        }
        return ans;
    }
}
