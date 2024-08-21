package StringBuilderandStrings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "repaper";
        boolean ans = checkPalindrome(str);
        System.out.println(ans);
    }
    static boolean checkPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        str = str.toLowerCase();

        if ( str == null || str.length() == 0) {
            return true;
        } 
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
