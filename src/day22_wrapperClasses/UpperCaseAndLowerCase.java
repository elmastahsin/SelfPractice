package day22_wrapperClasses;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        String str = "JAVA java";

        int countUpperCase =  0;
        int countLowerCase =0;
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isUpperCase(each)){
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            }else {
                continue;
            }
        }
        boolean result = countLowerCase==countLowerCase;
        System.out.println(result);
    }
}
/*
6. Write program that returns true if the total number of upper case characters
 are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods */