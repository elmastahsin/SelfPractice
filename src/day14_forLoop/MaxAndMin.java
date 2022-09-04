package day14_forLoop;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        // write a program that can ask the user enter to enter a number for five times,  print the maximum number
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i + 1) + ". number :");
            int a = input.nextInt();
            System.out.println(i + 1 + ". number:" + a);
            if (a > max) {
                max = a;
            }

        }
        System.out.println("max = " + max);

        System.out.println("*****************************");

        // write a program that can ask the user enter to enter a number for five times,  print the minimum number


        int min = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i + 1) + ". number :");
            int a = input.nextInt();
            System.out.println(i + 1 + ". number:" + a);
            if (i == 0) {
                min = a;
            }
            if (a < min) {
                min = a;
            }
            System.out.println("min = " + min);
        }

    }
}
