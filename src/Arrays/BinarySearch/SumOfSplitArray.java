package Arrays.BinarySearch;

public class SumOfSplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        int ans = sum(arr, k);
        System.out.println(ans);
    }
    static int sum(int[] arr, int m) {
         int start = 0;
         int end = 0;

         for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
         }


         while(start < end) {
            // try for mid as potential ans;
            int mid = start + (end - start)/2;
            //calculate how may pieces;
            int sum = 0;
            int pieces = 1;
            for (int i : arr) {
                if (sum + i > mid) {
                    sum = i;
                    pieces++;
                } else {
                    sum += i;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
         }
         return end;
    }
}
