package day08_terninary_switch;

public class NumberToWord {
    public static void main(String[] args) {
        int number = 10;
        String result = (number == 1) ? "One" : (number == 2) ? "Two" : (number == 3) ? "Three"
                : (number == 4) ? "Four" : (number == 5) ? "Five" : (number == 6) ? "Six"
                : (number == 7) ? "Seven" : (number == 8) ? "Eight" : (number == 9) ? "Nine" : "INVALID NUMBER";
        System.out.println(result);
    }

}