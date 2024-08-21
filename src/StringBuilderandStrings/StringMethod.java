package StringBuilderandStrings;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Suraj Pandey";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
