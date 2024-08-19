package Arrays.sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int ans = find(arr);
        System.out.println(ans);
        
    }
    static int find(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                 swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        // search the missing number....
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
