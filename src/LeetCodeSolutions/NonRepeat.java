package LeetCodeSolutions;

import java.util.Scanner;

public class NonRepeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an string :");
        String str = input.nextLine().toLowerCase();

        int indexOf = nonRepeating(str);
        if (indexOf > -1) {
            System.out.println("The index of non repeating vovel is :  " + indexOf + " The letter is " + str.charAt(indexOf));
        } else {
            System.err.println("The is no nonrepeating vovels: " + indexOf);
        }
    }

    public static int nonRepeating(String str) {


        for (int i = 0; i < str.length(); i++) {

            boolean uniqueLetter = false;
            if (isVovel(str.charAt(i))) {
                uniqueLetter = true;
                for (int j = 0; j < str.length(); j++) {
                    if (isVovel(str.charAt(j))) {
                        if (i != j && (str.charAt(i) == str.charAt(j))) {
                            uniqueLetter = false;
                            break;
                        }
                    }
                }
            }
            if (uniqueLetter) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isVovel(char i) {
        return (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u');
    }
}
/*Practice Question:
Given a string, write a method to find the
first non-repeating vowel (a, e, i, o, u)
in it and return its index. If it doesn't exist, return -1.
Assume that all the characters of the String is lowercase.
(Do not use String class functions other than charAt())

*/