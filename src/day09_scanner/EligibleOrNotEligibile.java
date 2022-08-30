package day09_scanner;

import java.util.Scanner;

public class EligibleOrNotEligibile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = input.nextInt();
        String result = (age >= 21 && age <= 150) ? "Eligible to buy alcohol" : "Not eligible to buy alcohol";
        System.out.println("result = " + result);


    }
}
/*2. Eligible or not Eligible to buy alcohol
            2.1 Ask the user to enter his/her age
            2.2 write a program that can check if the person eligible to buy alcohol

*/