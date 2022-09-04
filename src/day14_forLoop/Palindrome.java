package day14_forLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = input.next();
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        boolean isPalindrome = str.equalsIgnoreCase(result);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
/*7. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
*/