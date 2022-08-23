package day06_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {
        int salary = 75000;
        double taxRate = 0;
        double totalTax = 0;
        double netIncome = 0;
        boolean isMarried = true;
        if (salary >= 130000) {
            taxRate = 0.35;
        }
        if (salary >= 100000 && salary < 130000) {
            taxRate = 0.3;
        }
        if (salary >= 80000 && salary < 100000) {
            taxRate = 0.25;
        }
        if (salary < 80000) {
            taxRate = 0.2;
        }
        if (isMarried) {
            taxRate -= 0.05;
        }
        totalTax = salary * taxRate;
        netIncome = salary - totalTax;
        System.out.println("netIncome = " + netIncome);
    }
}
