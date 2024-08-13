import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Largest of Three Number " + a + ", " + b + ", " + c + ", " + "is " + max);


    /* use math in java */

    int maxByOtherMehtod = Math.max(Math.max(a, b), c);
    System.out.println("Largest of Three Number " + a + ", " + b + ", " + c + ", " + "is " + maxByOtherMehtod);
    }
}
