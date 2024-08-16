package Function;
public class Overloading {
    public static void main(String[] args) {
        /* Method overloading means two function name are same but arguments type are differnent or no. of arguments 
         * are different then can call work it happen at compile type
         */
        fun("suraj"); // work for string
        fun(8);
    }
    static void fun(int a) {
         System.out.println(a);
    }

    static void fun(String a) {
         System.out.println(a);
    }
}
