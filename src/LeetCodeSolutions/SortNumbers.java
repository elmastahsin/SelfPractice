package LeetCodeSolutions;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
       int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");

       /* int [] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] =input.nextInt();
        }
        Arrays.sort(array);

        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }*/
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a > b && a > c) {
            System.out.println(a); // a is biggest
            if (c > b) {
                System.out.println(c);
                System.out.println(b);
            } else {
                System.out.println(b);
                System.out.println(c);
            }
        } else if (b > a && b > c) { // b is biggest
            System.out.println(b);
            if (c > a) {
                System.out.println(c);
                System.out.println(a);
            } else {
                System.out.println(a);
                System.out.println(c);
            }
        } else if (c > a && c > b) { // c is biggest
            System.out.println(c);
            if (b > a) {
                System.out.println(b);
                System.out.println(a);
            } else {
                System.out.println(a);
                System.out.println(b);
            }
        }
    }
}
/*
Problem-1 🡪 Read 3 numbers from the user
and print them like the example in descending
order.
(example --> input x=5, y=4, z=6 => "output: 6-5-4")*/