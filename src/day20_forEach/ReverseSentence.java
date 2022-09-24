package day20_forEach;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "I Love Java";

        String[] str1 = str.split(" ");
        System.out.println(Arrays.toString(str1));
        String result = "";
        for (int i = 0; i < str1.length; i++) {
            if (i == 1) {
                String word = str1[i];
                for (int j = word.length() - 1; j >= 0; j--) {
                    result += word.charAt(j);
                }
                result += " ";
            } else{
                result += str1[i]+" ";
            }
        }
        System.out.println(result);
    }
}
/*1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java



*/