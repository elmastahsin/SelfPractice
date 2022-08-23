package day06_ifStatements;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = 'A';
        int c = (int) ch;
        String result = "";
        boolean isDigit = ch >= '0' && ch <= 9;
        boolean isLetter = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
        boolean isSpecialChar = !isLetter && !isLetter;

        if(isDigit){
            result = "DIGIT";
        }
        if (isLetter){
            result ="Alphabetic";
        }
        if (isSpecialChar){
            result = "Special Character";
        }

        System.out.println(result);



/*
        if (c >= 48 && c <= 57) {
            result = "DIGIT";
        }
        if (c >= 58 && c <= 64 || c >= 91 && c <= 96 || c >= 123 && c <= 126) {
            result = "SPECIAL CHARACTER";
        }
        if (c >= 65 && c <= 90) {
            result = "UPPERCASE CHARACTER";
        }
        if (c >= 97 && c <= 122) {
            result = "LOWER CHARACTER";
        }
        System.out.println("result = " + result);*/

    }
}
