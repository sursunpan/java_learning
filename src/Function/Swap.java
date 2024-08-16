package Function;
public class Swap {
    public static void main(String[] args) {
        /* swap two number means
         * a=4 b=6
         * a=6 b=4 // this will be our o/p
         * a,b,c
         * c=a=4 a=b=6 b=c=4
         */
        int a = 10;
        int b =20;
        System.out.println("Before swap " + a + " " + b);
        swap(a,b); 
        /* here not swap because in java in function in primitive data type pass by value that why it is not going to change
         * other object pass by reference of value so it will be change....
         */
    }
    static void swap(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("After swap " + a + " " + b); 
    }
}
