import java.util.Scanner;

public class Main {
    /*   public static void main(String[] args) {
           String firstName = "Noah";
           String lastName = "Smith";
           String companyName = "Apple";
           int salary = 200000;
           int startDay =10;
           int startMonth =1;
           int startYear =2022;
           boolean isFullTime = true;
           String jobTitle = "SDET";
           String officeAddress = "One Apple Park Way, Cupertino, CA 95014";

           String fullName= firstName + " " + lastName ;
           String fullStartDate = "" + startMonth + "/" + startDay +"/"+ startYear;
           String email= "" + firstName+ startDay + "@" + companyName +".com";
           int salaryAfter2Years = ((salary * 15) / 100);

           System.out.println("Employee Information");
           System.out.println("We have " + fullName + " joining " + companyName);
           System.out.println(firstName + " will start on " + fullStartDate + " as full time: "   + isFullTime);
           System.out.println(firstName + " here is some information about your employment" );
           System.out.println ("Your email is " + email);
           System.out.println ("Your base salary is $" + salary + " and after 2 years it will be $" + salaryAfter2Years);
           System.out.println("Welcome aboard, see you at " + officeAddress);

           //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
           // Variables are already declared and given
           Scanner scan=new Scanner(System.in);
           int areaCode=scan.nextInt();
           int localNumber=scan.nextInt();

           String phoneNumber;
           //WRITE YOUT CODE HERE:

           phoneNumber = "("+areaCode+")-"+localNumber;
           System.out.println(phoneNumber);

       }
   }*/
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        int indexNumOfGloves = -1;
        boolean hasIPad = false;
        String report = "";

        for (int i = 0; i < items.length; i++) {
            String itemName = items[i];
            double itemPrice = prices[i];
            int itemID = itemIDs[i];

            if (itemName.equals("Gloves")) {
                indexNumOfGloves = i;
            }

            if (itemName.equals("iPad")) {
                hasIPad = true;
            }

            report += itemName + " - " + itemPrice + " - #" + itemID + "\n";

        }


        System.out.println("indexNumOfGloves = " + indexNumOfGloves);
        System.out.println("hasIPad = " + hasIPad);
        System.out.println(report);


    }
}