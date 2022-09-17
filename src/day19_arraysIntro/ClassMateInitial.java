package day19_arraysIntro;

public class ClassMateInitial {
    public static void main(String[] args) {


        String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};


        for (int i = 0; i < classmates.length; i++) {

            String initial = classmates[i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ") + 1);
            System.out.println(initial);

        }


    }
    }
