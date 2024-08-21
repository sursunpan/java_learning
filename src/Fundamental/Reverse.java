package Fundamental;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        /* n=2345 o/p-> 5432
         * 2345 % 10 = 5 ===> answer = 5 * 10
         * 234 % 10 = 4  ====> answer 50 + 4 = 54 * 10 = 540
         * 23 % 10 = 3 =====> 540 +3=543 = 543*10 =5430
         * 2 % 10 = 2 
         * ==== 5432
         */

         @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int initialNum = num;
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num/10;
            ans = ans * 10 + rem;
        }

        System.out.println("The reverse of " + initialNum + " is " + ans);
    }
}
