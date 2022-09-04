package day15_whileLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = input.nextInt();
        System.out.println("enter divider");
        int divider = input.nextInt();

int count = 0;
int temp = num ;
     while ( num >= divider ){
         num -= divider;
         count++;

     }
     num = temp;
        System.out.println(count+" with a remainder of "+num);
    }
}
/*4.  Create a class named DivideTwoNumbers and
Write a program that can divide two positive numbers
 without using / (division) and * (multiplication) operators.
 */