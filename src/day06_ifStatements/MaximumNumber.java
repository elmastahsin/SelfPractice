package day06_ifStatements;

public class MaximumNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number");
        }
        if (num2 > num1) {
            System.out.println(num2 + " is the maximum number");
        }
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " is equal numbers");
        }
    }
}
