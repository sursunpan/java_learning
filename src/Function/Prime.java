package Function;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        boolean ans2 = optimizeIsPrime(n);
        if (ans == false) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }


        if (ans2 == false) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while(c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }


    static boolean optimizeIsPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
              if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
