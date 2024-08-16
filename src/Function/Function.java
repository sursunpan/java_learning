package Function;
import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        sum();
        greeting();
        int multiply = multiplication();
        System.out.println("The multiplication of two number is " + multiply);
        String intro = greet();
        System.out.println(intro);


        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int divid = divided(num1, num2);
        System.out.println("The division of two number "+ num1 + " ," + num2 + " is " + divid);
    }

    static void sum() {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    static void greeting() {
        System.out.println("Hello World");
    }

    static int multiplication() {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int num1, num2, ans;
        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        ans = num1 * num2;
        return ans;
    }

    static String greet() {
        return "Hi My Name is 'Suraj Pandey', I am fine";
    }

    /* Pass the value of numbers when you calling the method in main using arguments */

    static int divided(int num1, int num2) {
        if (num2 == 0) {
            return 0 ;
        }
        return num1 / num2;
    }
}
