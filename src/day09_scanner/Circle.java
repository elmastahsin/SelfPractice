package day09_scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the radius :");
        double radius = input.nextDouble();
        double area = radius * radius*3.14;
        double perimeter = 2*radius*3.14;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
/*2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

* */