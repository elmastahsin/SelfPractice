package day08_terninary_switch;

public class Loans {
    public static void main(String[] args) {
        int salary = 130000;
        int creditScore=650;
        String result =(salary > 60000 && creditScore>=600)? "Loan Approved"
                :"Loan Denied";
        System.out.println("result = " + result);
    }
}
