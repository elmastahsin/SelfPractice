package day11_string;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = input.next();
        System.out.println("Enter a word :");
        String word2 = input.next();
        input.close();
        String result = "";
        if (word.charAt(word.length() - 1) == (word2.charAt(0))) {
            result =(word+ word2.substring(1));
        }else {
            result =word + word2;
        }
        System.out.println("result = " + result);
        }
    }
