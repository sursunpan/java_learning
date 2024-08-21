package StringBuilderandStrings;

import java.util.ArrayList;

public class Operator {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //FOR string + is operator oveloading....
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));


        System.out.println("a" + 1); /* when integer is concated
                                        integer will converted to Integer that will call toString()
                                         */
        System.out.println("Suraj" + new ArrayList<>());
        System.out.println("Suraj" + new Integer(56));


        // System.out.println(new Integer(56) + new ArrayList<>()); /* + used only with primitive or one of them is string... */
        System.out.println(new Integer(56) + "" + new ArrayList<>());
    }
}
