package day20_forEach;

public class CountPalindrome {
    public static void main(String[] args) {
        String[] words = {"Anna", "Level", "Java", "Dad"};
        int countPalindrome = 0;
        for (String each : words) {
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reverse)) {
                countPalindrome++;
            }
        }
        System.out.println("countPalindrome = " + countPalindrome);
    }
}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

*/