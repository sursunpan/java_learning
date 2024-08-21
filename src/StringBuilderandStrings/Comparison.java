package StringBuilderandStrings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Suraj";
        String b = "Suraj";

        System.out.println(a==b); /* true */
        /*
         * == method :- check if ref variable are pointing to same object :-means
         * a is Pointing to Suraj b is pointing to same Suraj then give true and if a is pointing Suraj, and b is 
         * pointing to another Suraj then give false
         */

         String c = new String("Suraj"); /* by this method we can create different String object 
                                                    with same value but not created in String pool it will created in
                                                    heap....... */
        System.out.println(b==c); /* false */

        System.out.println(a.equals(c)); /* true  beacuse this method check only value... */


        /* System.out.println(a[0]); not work here becuse string is collection of character */

        System.out.println(a.charAt(0)); /* s */
    }
}
