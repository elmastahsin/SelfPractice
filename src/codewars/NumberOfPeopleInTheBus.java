package codewars;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});
        if (countPassengers(list) == 5) {
            System.out.println("Passed");
        }
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
//        int numberOfPeopleGetOn = 0;
//        int numberOfPeopleGetOff = 0;
//        int countPeople = 0;
//        for (int i = 0; i < stops.size(); i++) {
//            numberOfPeopleGetOn += stops.get(i)[0];
//            numberOfPeopleGetOff += stops.get(i)[1];
//        }
//        return countPeople = numberOfPeopleGetOn - numberOfPeopleGetOff;

        return stops.stream().mapToInt(x->x[0]-x[1]).sum();
    }
}
