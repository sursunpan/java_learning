import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
       
        System.out.print(a + ", " + b);
         for (int i = 2; i < n; i++) {
           int c = a + b;
           System.out.print(", " + c);
           a=b;
           b=c;
         }

         System.out.println();
         /*  0,1,1,2,3,5,8,13............
          * x = 0 y = 1
          * z = x + y = 0 + 1 = 1 // this will be our output..... x=y=1 y=z=1
          * z = x + y = 1+1 // 2 this will be our output...... x=y=1 y=z=2
          */

          int num = in.nextInt();
          int x = 0;
          int y = 1;

          int z = 0; // this is temp for our output
          int i = 2;


          while (i < num) {
            z = x + y;
            x = y;
            y = z;
            i++;
          }

        //   for (int i = 2; i < num; i++) {
        //     z = x + y;
        //     x = y;
        //     y = z;
        //   }

          System.out.print("FibonacciNumber of " + num + "th is " + z);
    }
}
