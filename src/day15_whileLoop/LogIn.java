package day15_whileLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        String validUserName = "Cydeo";
        String validPassword = "Cydeo123";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter userName :");
        String userName = input.next();
        System.out.println("Enter password : ");
        String password = input.next();
        if (userName.equals(validUserName) && password.equals(validPassword)) {
            System.out.println("Logged in.");
        } else {
            for (int i = 1; i < 3; i++) {
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter userName :");
                userName = input.next();
                System.out.println("Enter password : ");
                password = input.next();
                if (userName.equals(validUserName) && password.equals(validPassword)) {
                    System.out.println("You are now logged in");
                    break;
                }
                System.out.println("Your account is lucked. Please contact with the support team");
            }
        }
    }
}
/*7. you are writing a code for the log-in function of the Cydeo Application,
 assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user
                 to have three attempts to enter correct credentials and if all three
                 attempts are failed, then print "Your account is lucked."


Extra Spicy:*/
