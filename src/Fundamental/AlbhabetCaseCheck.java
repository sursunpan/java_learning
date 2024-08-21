package Fundamental;

import java.util.Scanner;

public class AlbhabetCaseCheck {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);


        if (ch >= 'a' && ch <= 'z') {
            System.out.printf("The is small letter character", ch);
        } else {
            System.out.printf("The is largest letter character", ch);
        }

        // here trim remove the extra space......charAt give the char of string at 0th position //


    }
}