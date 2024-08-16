package Function;
public class Shadowing {
    static int x = 8; // this will be showed by line 5
    public static void main(String[] args) {
        System.out.println(x); // 8
        // int x = 40;
        // System.out.println(x); // 40

        int x;
        // System.out.println(x); showing error because scope will begin when value initilised
        x = 40;
        System.out.println(x); // 40
        fun(); // 8
    }
    static void fun() {
        System.out.println(x);
    }
}

// showding not work in method it work in class....