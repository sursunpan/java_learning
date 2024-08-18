package Arrays.BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        /* if array is sorted but you dont know order then first and last number comparision give the order  */
        // int[] arr = {3,6,7,8,60,67,89,98};
        int [] arr = {98,89,67,60,8,7,6,3};
        String order = new String();
        if (arr[0] > arr[arr.length-1]) {
            order = "decreasing";
        } else {
            order = "increasing";
        }
        int ans = BinarySearch(arr, 67, order);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target, String order) {
         if (order.equals("increasing")) {
            int left = 0;
            int rigth = arr.length - 1;
            int mid = left + (rigth - left) / 2;
            while(left <= rigth) {
                if (target > arr[mid]) {
                    left = mid + 1;
                } else if (target < arr[mid]) {
                    rigth = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
         }
         if (order.equals("decreasing")) {
            int left = 0;
            int rigth = arr.length - 1;
            while(left <= rigth) {
                int mid = rigth + (left - rigth)/2;
                if (target > arr[mid]) {
                    rigth = mid - 1;
                } else if (target < arr[mid]) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
         }
         return -1;
    }
}
