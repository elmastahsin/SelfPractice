package day11_string;

import java.util.Scanner;

public class WebsiteAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter website:");

        String url = input.next();

        boolean validWebSite = (url.startsWith("www.") &&
                (url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov")));

        if (validWebSite) {
            System.out.println("Website is valid");
        } else {
            System.out.println("Website is invalid");
        }


    }
}
/*
* 1. Create a class named WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov*/