package day14_forLoop;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        int a = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

