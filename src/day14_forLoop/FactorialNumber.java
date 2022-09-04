package day14_forLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        int result = 1;
        for (int i = a; 0 < i; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}
