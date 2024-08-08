import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("Sum of two number is = " + sum);
    }
}
