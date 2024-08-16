package Function;
import java.util.Arrays;

public class Vargars {
    public static void main(String[] args) {
        fun(5,6,7,8,8,7,5);
        mutiple(9,8,"surnfrnfa", "fjafnashb fah");
    }
    static void fun(int ...v) { // if you dont know how many arg present.....
        System.out.println(Arrays.toString(v));
    }

    static void mutiple(int a, int b, String ...v) {
        System.out.println(a + ", " + b + Arrays.toString(v));
    }
}
