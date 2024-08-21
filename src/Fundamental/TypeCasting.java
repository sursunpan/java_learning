package Fundamental;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        /*  automatic typecasting happens only when small into large means if given int then it 
        convert into float but if give float not convert into int */
        
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        float num = input.nextInt();
        System.out.println(num);



        int num2 = (int)(56.09f); // this is typecasting
        System.out.println(num2);

        // automatic type promotion in expression
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1
        System.out.println(b);


        // java is working unicode.....

        // Rule for type casting



        byte d = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double dd = 0.1234;

        double result = (f*d)+(i/c)-(dd*s);
        // float + int - double = double
        System.out.println(result);



    }
}
