package day15_whileLoop;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
String str = input.next();
        System.out.println("Enter a char :");
        String ch = input.next();
int charCount =0 ;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)== ch.charAt(0)){
                charCount++;
            }

        }
        System.out.println(str);
        System.out.println(ch);
        System.out.println(charCount);

    }
}
/*3. Create a class named FrequencyOfChar and Write a program that asks user
 to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
                */