import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner takeInput = new Scanner(System.in);
        System.out.print("Pls Provide some input:-");
        int rollNo = takeInput.nextInt();
        System.out.println("Your input is "+ rollNo);
    }
}
