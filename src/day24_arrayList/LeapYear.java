package day24_arrayList;

import java.time.LocalDate;

public class LeapYear {
    public static void main(String[] args) {

    }
    public static boolean isLeapYear(int birthdayYear){
        return LocalDate.of(birthdayYear,1,1).isLeapYear();
    }
}
/*8. Create a function that accepts
an int argument birthYear, return true if the person was born on leap year, otherwise return false*/