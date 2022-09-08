package day16_DoWhile;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String answer ;

        do{
        System.out.println("Enter the length of the rectangle: ");
        double l = input.nextDouble();
        while (!(l>0)){
            System.err.println("Invalid Entry for the length of the rectangle");
            System.out.println("Enter the length of the rectangle: ");
            l = input.nextDouble();
        }
        System.out.println("Enter the width of the Rectangle:");
        double w = input.nextDouble();
        while (!(w>0)) {
            System.err.println("Invalid Entry for the width of the rectangle");
            System.out.println("Enter the width of the rectangle: ");
            w = input.nextDouble();
        }
        double area = l*w;
        double  perimeter =  2* ( l+ w);

            System.out.println("perimeter = " + perimeter);
            System.out.println("area = " + area);
        System.out.println("Would you like to calculate another rectangle?");
        answer = input.next().toLowerCase();
        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid Entry ");
            System.out.println("Would you like to calculate another rectangle?");
            answer = input.next().toLowerCase();
        }
    } while (answer.equals("yes"));
        System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
    }
}
/*
* 6. Write a program that can calculate the area and perimeter of a Rectangle:
                        1. Ask the user "Enter the length of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the
                                * program after displaying the error message
                                *  "Invalid Entry for the length of the rectangle"

                        2. Ask the user "Enter the width of the Rectangle:"
                                if user enters 0 or negative numbers, terminate
                                * the program after displaying the error message
                                * "Invalid Entry for the width of the rectangle"

                        3. Display:
                                        1. Area of rectangle
                                        2. Perimeter of rectangle

                        4. Ask the user "Would you like to calculate another Rectangle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print
                                        * "Thank you for using Cydeo Rectangle Calculator APP"

                                If user enters an invalid entry, ask the user to
                                * re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

*/