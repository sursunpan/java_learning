package Arrays.BinarySearch;

public class Basic {

    public static void main(String[] args) {
        /* The worst case is time complexity is log(n)
         * 
         */
        int[] arr = {23,45,67,87,97,108,456,56};
        int target = 108;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target) {
         int left = 0;
         int rigth = arr.length - 1;

         while(left <= rigth) {
            int mid = left + (rigth - left) / 2;
            if (target > arr[mid]) {
                left = mid + 1;
            }else if (target < arr[mid]) {
                rigth = mid - 1;
            } else {
                return mid;
            }
         }
         return -1;
    }
}
