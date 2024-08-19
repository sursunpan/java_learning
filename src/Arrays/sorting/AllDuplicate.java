package Arrays.sorting;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicate(arr);
        System.out.println(ans);
    }
    static List<Integer> findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

    List<Integer> ans = new ArrayList<>();
    for (int j = 0; j < arr.length; j++) {
        if (arr[j] != j+1) {
            ans.add(arr[j]);
        }
    }
    return ans;
    }
     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
