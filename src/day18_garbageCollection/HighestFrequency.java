package day18_garbageCollection;

import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.next();

        int highestFrequency = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (ch == s.charAt(j)) {
                    count++;
                }
            }

            if (count > highestFrequency) {
                highestFrequency = count;
            }

        }

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (ch == s.charAt(j)) {
                    count++;
                }
            }

            if (count == highestFrequency && !result.contains(ch + "")) {
                result += ch;
            }

        }


        System.out.println(result);

    }



}

