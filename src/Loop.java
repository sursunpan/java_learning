import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        /*================== for loop ====================== */
        /* print number from 1 to 5 */
        for(int i=1; i <= 5; i++ ) {
           System.out.print(i);
        }

        System.out.println();

        /* print number from 1 to n */

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.print(num + " ");
        }

       System.out.println();

        /*=================== while loop ======================= */
        /* print number from 1 to 5 */
        int numb = 1;
        System.out.println(" Print via while loop ");
        while (numb <= 5) {
            System.out.print(numb);
            numb++;
        }

        /* when we use while loop or when we use for loop? 
         * when we know how many time we are run the loop then we use for loop and we dont know then we use while loop.....
        */

        /*=========================do while======================== */
        int doNum = 1;
        do {
          System.out.println("first time it excute while condition is match or not:-)");
        } while (doNum != 1); {
              System.out.println("Not print any thing");   
        }

    }
}
