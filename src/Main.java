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

        Scanner input = new Scanner(System.in);
        String answer = "";

        do {
            System.out.println("Enter your first number");
            double num1 = input.nextDouble();

            System.out.println("Enter the math operator");
            String op = input.next();

            while ((op.length() != 1) && !( op.equals("/") || op.equals("*") || op.equals("+") || op.equals("-"))) {
                System.err.println("Invalid operator, try again");
                op = input.next();
            }

            System.out.println("Enter your second number");
            double num2 = input.nextDouble();

            double result = op.equals("/") ? num1 / num2 : op.equals("*")  ? num1 * num2
                    : op.equals("-")? num1 - num2 : num1 + num2;
            System.out.println("Result = " + result);

            System.out.println("Would you like to continue? Yes/No");
            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid answer, try again");
                answer = input.next().toLowerCase();
            }

        } while (answer.equals("yes"));
        System.out.println("Good Bye");


    }
}