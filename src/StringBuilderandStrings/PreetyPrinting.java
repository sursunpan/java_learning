package StringBuilderandStrings;

public class PreetyPrinting {
    public static void main(String[] args) {
        float a = 453.1234f;
        System.out.printf("Formated number is %.2f", a);

        System.out.println();

        System.out.printf("Pie: %.3f", Math.PI);

        System.out.println();

        System.out.printf("Hello my name is %s and I am %s %n", "Suraj", "Pandey");


        /* different place holder are:-
         *  %s: String
         *  %d: Decimal integer
         *  %f: Floating-point number
         *  %c: Character
         *  %b: Boolean
         *  %x: Hexadecimal integer
         *  %e: Exponential floatiing-point number
         *  %i: Integer (base10)
         *  %o: Octal number (base10)
         *  %u: Unsigned decimal (integer) number
         *  %x: Hexadecimal number (base16)
         *  %t: Date/time
         *  %n: newline
         */
    }
}