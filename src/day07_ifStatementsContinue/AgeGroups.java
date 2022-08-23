package day07_ifStatementsContinue;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 34;
        String result = "";
        boolean validAge = age > 0 && age < 150;
        boolean isTeenager = age < 21;
        boolean isAdult = age >= 21 && age < 55;
        boolean isSenior = age > 55;
        if (validAge) {
            if (isTeenager) {
                result = "Teenager";
            } else if (isAdult) {
                result = "Adult";
            } else {
                result = "Senior";
            }
        } else {
            result = "Invalid Age";
        }
        System.out.println("result = " + result);
    }
}
