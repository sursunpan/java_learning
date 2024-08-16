package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        /* Arraylist is used where you dont know about size... */
        /* ArrayList<Integer> list = new ArrayList<>(10) */
        
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(50);
        list.add(60);
        list.add(63);
        list.add(62);
        list.add(64);
        list.add(65);
        list.add(66);
        list.add(67);
        list.add(59);
        list.add(54);
        list.add(55);
        list.add(55);
        list.add(54);
        list.add(51);
        list.add(53);
        list.add(44);
        list.add(99);

        System.out.println(list);
        list.set(0,80);
        list.remove(3);

        ArrayList<String> strList = new ArrayList<>(5);

        for (int i =0; i<5; i++) {
            strList.add(in.next());
        }

        for (int i =0; i<5; i++) {
            System.out.println(strList.get(i));
        }
    }
}
