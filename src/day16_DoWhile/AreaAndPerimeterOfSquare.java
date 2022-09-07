package day16_DoWhile;

import java.util.Scanner;

public class AreaAndPerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "";
        do {
            System.out.println("Enter the side of square: ");
            double side = input.nextDouble();
            while (side <= 0) {
                System.err.println("Invalid Entry for side of square");
                System.out.println("Enter the side of square: ");
                side = input.nextDouble();
            }
            double area = side * side;
            double perimeter = side * 4;

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry ");
                System.out.println("Would you like to calculate another circle?");
                answer = input.next().toLowerCase();
            }
        } while (answer.equals("yes"));
        System.out.println("Thank you for using Cydeo Circle Calculator APP");
    }
}
/*
* 5. Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

*/