package day06_ifStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int number = 24;
        if (number > 0) {
            System.out.println(number + " is positive number");
        }
        if (number < 0) {
            System.out.println(number + " is negative number");
        }
        if (number == 0) {
            System.out.println(number + " is zero.");
        }
    }
}
