package day09_scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.println("Enter a math operator (+, -, *, /):");
        char operator = input.next().charAt(0);

        System.out.println("Enter the second number: ");
        double secondNumber = input.nextDouble();
        input.close();
        double result = 0;
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("result = " + result);

    }
}
/*
* 9. Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"
*/
