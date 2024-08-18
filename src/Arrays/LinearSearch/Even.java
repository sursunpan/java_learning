package Arrays.LinearSearch;

public class Even {
    public static void main(String[] args) {
        int[] arr = new int[] {4503,6,54,43,3459594,22959,120,7855,975};
        int ans = EvenNumber(arr);
        System.out.println(ans);
    }

    static int EvenNumber(int[] nums) {
        int count = 0;
        for (int i: nums) {
            if (isEven(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int i) {
        int digits = digits(i);
        if (digits % 2 == 0) {
           return true;
        }
        return false;
    }

    static int digits(int num) {
        int count = 0;
        while (num>0) {
            count++;
            num = num/10;
        }
        return count;
    }
}
