package day04_concatenation;

public class SalaryCalculator2 {
    public static void main(String[] args) {
        int hourlyRate = 50;
        int weeklyHours = 45;
        int stateRate = 6;
        int federalRate = 26;

        int salaryBeforeTax = 50 * 45 * 52;
        int federalTax = salaryBeforeTax * federalRate / 100;
        int stateTax = salaryBeforeTax * stateRate / 100;
        int totalTax = federalTax + stateTax;
        int netIncome = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is :  $" + salaryBeforeTax);
        System.out.println("\tFederal tasx is: $" + federalTax);
        System.out.println("\tState tax is: $" + stateTax);
        System.out.println("\tTotal tax is: $" + totalTax);
        System.out.println("\tNet income is: $" +netIncome);


    }
}
