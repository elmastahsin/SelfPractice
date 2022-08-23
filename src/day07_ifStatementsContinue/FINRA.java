package day07_ifStatementsContinue;

public class FINRA {
    public static void main(String[] args) {
        int number = 64;
        boolean validNumber = number % 3 == 0 || number % 5 == 0;
        boolean multipleOf3 = number % 3 == 0;
        boolean multipleOf5 = number % 5 == 0;
        String result = "";

        if (validNumber) {
            if (number % 3 == 0 && number % 5 == 0) {
                result = "FINRA";
            } else if (number % 5 == 0) {
                result = "RA";
            } else {
                result = "FIN";
            }
        } else {
            result = "Invalid Number";
        }
        System.out.println("result = " + result);

    }
}
