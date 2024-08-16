package Function;

import java.util.Scanner;

public class Armsstrong {
    public static void main(String[] args) {
        /* cube of individual digit of three digit number and sum is same as number then it is armsstrong... */
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isArmstrong(n);
        if (ans == false) {
            System.out.println("This is  not armsstrong number");
        }
        if (ans == true) {
            System.out.println("this is the armsstrong number");
        }


        // all the armsstrong number
        for(int i = 100; i<1000; i++) {
            boolean ans2 = isArmstrong(i);
            if (ans2 == true) {
                System.out.println(i + " is the armsstrong number");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }

        if (sum == original) {
            return true;
        }
        return false;
    }
}
