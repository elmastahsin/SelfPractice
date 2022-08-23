package day06_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {
        int gradeLevel = 16;
        if (gradeLevel >= 1 && gradeLevel <= 5) {
            System.out.println("Elementary School");
        }
        if (gradeLevel >= 6 && gradeLevel <= 8) {
            System.out.println("Middle school");
        }
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            System.out.println("High School");
        }
        if (gradeLevel >= 13 && gradeLevel <= 16) {
            System.out.println("College ");
        }
        if (gradeLevel >= 17 && gradeLevel <= 18) {
            System.out.println("Grad School");
        }

        System.out.println("****************************");
        String result = "";
        if (gradeLevel >= 1 && gradeLevel <= 5) {
            result = "Elementary School";
        }
        if (gradeLevel >= 6 && gradeLevel <= 8) {
            result = "Middle school";
        }
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            result = "High School";
        }
        if (gradeLevel >= 13 && gradeLevel <= 16) {
            result = "Collage";

        }
        if (gradeLevel >= 17 && gradeLevel <= 18) {
            result = "Grad School";
        }
        System.out.println("result = " + result);
    }
}
