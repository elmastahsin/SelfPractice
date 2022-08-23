package day06_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 1;

        boolean has28days = number==2;
        boolean has30days = number ==4 || number==6||number==9||number==11;
        boolean has31days = !has30days && !has28days;
        String result ="";

        if (has31days){
            result = "31 days";
        }
        if (has28days){
            result = "28 days";

        }
        if (has30days){
            result = "30 days";

        }
        System.out.println("result = " + result);


        System.out.println("******Another Answer********");
        if (number == 1) {
            System.out.println("31");
        }
        if (number == 2) {
            System.out.println("28");
        }
        if (number == 3) {
            System.out.println("31");
        }
        if (number == 4) {
            System.out.println("30");
        }
        if (number == 5) {
            System.out.println("31");
        }
        if (number == 6) {
            System.out.println("30");
        }
        if (number == 7) {
            System.out.println("31");
        }
        if (number == 8) {
            System.out.println("31");
        }
        if (number == 9) {
            System.out.println("30");
        }
        if (number == 10) {
            System.out.println("31");
        }
        if (number == 11) {
            System.out.println("30");
        }
        if (number == 12) {
            System.out.println("31");
        }
    }
}
