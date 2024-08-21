package Fundamental;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int initialNum = num;
        int numToCounting = in.nextInt();
        int count = 0;

        /*  2944849494889    9  o/p--->4
         *  count = 0 
         *  if 9 is present then count 1........
         *  
         */


         /* number divided by 10 rem---> always last digit....  13839 ---> last number 13839%10----> 9
          * then new number is n/10 == 1383....
          */

          while (num > 0) {
            if (num % 10 == numToCounting) {
                 count++;
            }
            num=num/10;
          }
          System.out.println("The occurence of " + numToCounting + " in "+ initialNum + " is " + count);
    }
}
