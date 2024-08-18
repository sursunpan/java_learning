package Arrays.BinarySearch;

public class Charfind {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        char ans = Search(letters, target);
        System.out.println(ans);
    }
    static char Search(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (target >= letters[letters.length - 1] || target < letters[0]) {
            return letters[0];
        }
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }
}
