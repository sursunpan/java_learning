import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // how to give output in java
        System.out.println("Hello World!");
        System.out.print("My name is suraj pandey "); // this print not contain new line
        System.out.println("My brother name is shailendra pandey!!");

        // how to take input from java

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in); // taking input from keyword
        int myAge = input.nextInt();
        System.out.println("My age is " + myAge);
    }

}