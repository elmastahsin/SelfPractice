package day12_customMethod;

public class FullName {
    public static void capitalization(String firstName, String lastName){
firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(firstName + " " + lastName);
    }
}
