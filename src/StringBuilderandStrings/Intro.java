package StringBuilderandStrings;

public class Intro {
    public static void main(String[] args) {
        /* here name and secondName both are pointing same "Suraj" object in String Pool in heap
         * so when we try "Suraj" object for reference variable for any then change for other that is why we 
         * cannot change string so string is immutable......
         */

        String name = "Suraj"; // collections of character
        String secondName = "Suraj";
        System.out.println(name + " "+ secondName);

        /* Here i am not change the object but created the new Object.. */
        String a = "Shailendra";
        System.out.println(a);
        a = "Pandey";  /* after this a = "Shailendra" becomes garbage collection.... */
        System.out.println(a);
    }
}
