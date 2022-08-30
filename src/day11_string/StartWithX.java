package day11_string;

import java.util.Scanner;

public class StartWithX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = input.next();

        if (word.startsWith("x")){
           word = word.replaceFirst("x","a");
        }

        System.out.println("word = " + word);

    }
}
/*2. Create a class named StartsWithX and write a program that asks user to enter a word.
If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
*/