package day12_customMethod;

public class Day {
    public static void day (int number){
        if (number <1 && number> 7){
            System.err.println("Invalid Number");
        }
        String day = (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday"
                :(number==4)? "Thursday" :(number==5)? "Friday" :(number==6)?"Saturday":"Sunday";

        System.out.println(day);

    }
}

/*4. Create a method named day that can display the name of the day
based on the given number to the method, if the number is invalid,
then the method should print the error message "Invalid Number"
        Ex:
        day(5)

        output:
        Friday
*/