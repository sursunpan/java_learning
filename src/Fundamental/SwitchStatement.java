package Fundamental;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        /* switch statement, you can jump to various cases based on your expression.
         * note:---
         * cases have to be same types as expressions, must be e constanst or literal
         * duplicate case values are not allowed
         * break is use to terminate the sequence
         * if break is not used, it will continue to next case
         * default will excute when none of above does
         * if default is not at the end put break after it:-)
         */

         @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
         String fruit = in.next();
         switch (fruit) {
            case "Mango":
                System.out.println("Kings of fruit");
                break;
            case "Apple":
                 System.out.println("A sweet red fruit");
            case "Orange":
            System.out.println("Round Fruit");
            case "Grapes":
            System.out.println("Small fruit");
            default:
            System.out.println("Please enter valid fruit:-||");
         }

         switch (fruit) {
            case "Mango" -> System.out.println("Kings of fruit");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round Fruit");
            case "Grapes" ->System.out.println("Small fruit");
            default -> System.out.println("Please enter valid fruit:-||");
         }


         int day = in.nextInt();
         switch(day) {
            case 1 -> System.out.println("MONDAY");
            case 2 -> System.out.println("TUESDAY");
            case 3 -> System.out.println("WEDNESDAY");
            case 4 -> System.out.println("THURSDAY");
            case 5 -> System.out.println("FRIDAY");
            case 6 -> System.out.println("SATURADAY");
            case 7 -> System.out.println("SUNDAY");
            default -> System.out.println("PLS PROVIDE PERFECT DAY");
         }


         switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
         }

         // nested switch

         int empId = in.nextInt();
         String department = in.next();

         switch(empId) {
            case 1 -> System.out.println("Suraj Pandey");
            case 2 -> System.out.println("Kiran Debnath");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("incorrect depart");
         }
    }
}
