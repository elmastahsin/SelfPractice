package day07_ifStatementsContinue;

public class Grade {
    public static void main(String[] args) {
        char grade = 'A';
        String result = "";
        boolean validGrade = (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F');
        if (validGrade) {
            if (grade == 'A') {
                result = "excellent";
            } else if (grade == 'B') {
                result = "great job";
            } else if (grade == 'C') {
                result = "Good";
            } else if (grade == 'D') {
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {
            result = "Invalid Grade";
        }
        System.out.println("result = " + result);

    }
}
