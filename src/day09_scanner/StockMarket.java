package day09_scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many total shares do you have ?");
        int shares = input.nextInt();
        String result = "Invalid NUmber of Shares";
        if (shares > 0) {
            System.out.println("how much does your total value in the stock market? ");
            double value = input.nextDouble();

            input.nextLine();

            System.out.println("Enter the name of the company you have the most shares in: ");
            String companyName = input.nextLine();
            result = "Your total stock market holding is $" + (int)value
                    + " which is made up of " + shares + " shares. "
                    + companyName + " is your company holdings";
        }
        System.out.println(result);
    }
}
/*
8. Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

        */