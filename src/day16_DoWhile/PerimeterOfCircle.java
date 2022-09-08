package day16_DoWhile;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Enter the radius of circle: ");
            double r = input.nextDouble();
            while (r <= 0) {
                System.err.println("Invalid Entry for radius of circle");
                System.out.println("Enter the radius of circle: ");
                r = input.nextDouble();
            }
            double diameter = r *2;
            double area = r *r * 3.14;
            double perimeter  = 2 * r * 3.14;

            System.out.println("Diameter of circle: " + diameter);
            System.out.println("Area of circle" + area);
            System.out.println("Perimeter of circle"+ perimeter);
            System.out.println("Would you like to calculate another circle?");
            answer = input.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry ");
                System.out.println("Would you like to calculate another circle?");
                answer = input.next().toLowerCase();
            }
        } while (answer.equals("yes"));
        System.out.println("Thank you for using Cydeo Circle Calculator APP");
        System.exit(1);
    }

}
/*4. Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate
                                the program after displaying the error message "Invalid Entry for
                                the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter
                                until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
*/