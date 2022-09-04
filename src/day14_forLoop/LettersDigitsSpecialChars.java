package day14_forLoop;

import java.util.Scanner;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "ABNAkd@#$1234and!";
        String digit = "";
        String letters = "";
        String specialChars = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digit += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else {
                if (ch != ' ') {
                    specialChars += ch;
                }
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digit = " + digit);
        System.out.println("specialChars = " + specialChars);

    }
}
/*5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
*/
