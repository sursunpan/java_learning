public class Loop {
    public static void main(String[] args) {
        int a = 10;
        if (a == 10) {
            System.out.println("Hello World");
        }


        int count = 1;
        while(count != 5) {
            System.out.print(count);
            count++;
        }

        System.out.println();

        for(int i=0; i < 5; i++ ) {
           System.out.print(i);
        }
    }
}
