package Function;
public class Scope {
    /* if any variable define inside the function then its variable work inside the same function not outside the function
     * called function scope.....
     */

     /*
      * inside the same method if create one block and inside the block you create a variable its work only inside the same block
      * but you define variable inside method but outside the block not again initliaze inside the block but you can change value
      * called block scope..... 
      */


      /*
       * in loop variable same as block....scope
       */

      @SuppressWarnings("unused")
      public static void main(String[] args) {
        int a = 10;  
        int b = 20;

        {
            a = 50; // change the value
           // int a = 30 // not work init outside
           int c = 90;
        }
        int c = 70; // it work here......
      }
}
