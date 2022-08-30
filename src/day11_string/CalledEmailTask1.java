package day11_string;

import java.util.Scanner;

public class CalledEmailTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = input.next();
        input.close();
        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));
        String email2 = lastName + "_" + firstName + domain;
        System.out.println("email2 = " + email2);

    }
}
/*
* 8. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name
   * and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email
    * (Saperated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
*/