package LeetCodeSolutions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int reverseNumber = 0;
        int remainder = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            remainder = tempNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            tempNumber = tempNumber / 10;
        }
            System.out.println(number == reverseNumber);


        /*
        String str = input.nextLine();

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        // boolean isPalindrome = str.equalsIgnoreCase(result);

        System.out.println(str.equalsIgnoreCase(result));
*/

    }
}
/*Problem-2 🡪 Read a number from the user
 and check if it is palindrome or not
 (example1 --> input=1234 => output=false, example2 --> input=1221 => output=true)*/