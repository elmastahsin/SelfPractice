package day12_customMethod;

public class DaysInMonth {
    public static void numberOfDays (String month){
month = month.substring(0,1).toLowerCase() + month.substring(1);

        switch (month){
            case "February":
                month += 28 + " days";
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                month += 30 + " days";
                break;

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                month += 31 + " days";
                break;

            default:
                month = "Invalid month";
        }

        System.out.println(month);

    }


}
//1, 3, 5, 7, 8, 10, 12
//4, 6, 9, 11
/*
5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")
        output:
            June has 30 days
 */