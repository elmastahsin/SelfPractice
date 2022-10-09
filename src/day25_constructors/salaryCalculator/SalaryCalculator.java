package day25_constructors.salaryCalculator;

public class SalaryCalculator {

    public double hourlyRate;
    public int weeklyHours;
    public double stateTax;
    public double federalTax;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTax, double federalTax) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTax = stateTax;
        this.federalTax = federalTax;
    }

    public double salary(){
        return (hourlyRate * weeklyHours)*52;
    }
    public double stateTax(){
        return salary()*stateTax;
    }
    public double federalTax(){
        return salary()*federalTax;
    }
    public double salaryAfterTax(){
        return salary()- (stateTax()+federalTax());
    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate= $" + hourlyRate +
                ", weeklyHours= $" + weeklyHours +
                ", stateTax=  $" + stateTax() +
                ", federalTax= $" + federalTax() +
                ", salary after tax= $" + salaryAfterTax() +

                '}';
    }
}
/*Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): claculates the totalstateTax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object*/