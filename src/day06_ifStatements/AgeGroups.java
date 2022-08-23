package day06_ifStatements;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 3;
        String result = "";
        boolean isInfant = age >= 1 && age <= 2;
        boolean isToddler = age >= 3 && age <= 5;
        boolean isKid = age >= 6 && age <= 9;
        boolean isPreTeen = age >= 10 && age <= 12;
        boolean isTeenager = age >= 13 && age <= 17;
        boolean isYoungAdult = age >= 18 && age <= 20;
        boolean isAdult = age >= 21 && age <= 39;
        boolean isYoungMiddleAgedAdult = age >= 49 && age <= 49;
        boolean isMiddleAgedAdult = age >= 50 && age <= 54;
        boolean isVeryYoungSenior = age >= 55 && age <= 64;
        boolean isYoungSeniorCitizien = age >= 65 && age <= 74;
        boolean isSeniorCitizien = age >= 75 && age <= 84;
        boolean isOldSeniorCitizien = age >= 85;

        if (isInfant){
            result = "Infant";
        }
        if (isToddler){
            result = "Toddler";
        }
        if (isKid){
            result = "Kid";
        }if (isPreTeen){
            result = "Pre-Teen";
        }
        if (isTeenager){
            result = "Teenager";
        }
        if (isYoungAdult){
            result = "Young Adult";
        }
        if (isAdult){
            result = "Adult";
        }
        if (isYoungMiddleAgedAdult){
            result = "Young Middle Age Adult";
        }
        if (isMiddleAgedAdult){
            result = "Middle Aged Adult";
        }
        if (isVeryYoungSenior){
            result = "Very Young Senior";
        }
        if (isYoungSeniorCitizien){
            result = "Young Senior Citizien";
        }
        if (isSeniorCitizien){
            result = "Senior Citizien";
        }
        System.out.println(result);





    }
}
