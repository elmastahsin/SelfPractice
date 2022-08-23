package day07_ifStatementsContinue;

public class GradeLevel {
    public static void main(String[] args) {
        byte number = 14;
        boolean validNumber = number >= 1 && number <= 18;
        boolean elemantarySchool = number <= 5;
        boolean middleSchool = number <= 8;
        boolean highSchool = number <= 12;
        boolean collage = number <= 16;
        boolean gradSchool = number <= 18;
        String result = "";
        if (validNumber) {
            if (elemantarySchool) {
                result = "Elemetary School";
            } else if (middleSchool) {
                result = "Middle School";
            } else if (highSchool) {
                result = "High School";
            } else if (collage) {
                result = "Collage";
            } else {
                result = "Grad School";
            }
        } else {
            result = "Invalid Grade";
        }
        System.out.println("result = " + result);
    }
}
