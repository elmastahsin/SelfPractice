package day20_forEach;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "heart"; //"aehtr"
        String str2 = "earth"; //"aehtr"

        //  String[] s1 = str1.split("");
        // String[] s2 = str2.split("");

        //Arrays.sort(s1);
        //Arrays.sort(s2);

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        boolean isAnagram = Arrays.equals(a1, a2);

        System.out.println("isAnagram = " + isAnagram);
   /*     if (Arrays.equals(a1,a2)){
            System.out.println("Anagram");
        }*/


    }
}
