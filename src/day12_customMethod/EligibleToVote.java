package day12_customMethod;

public class EligibleToVote {
    public static void eligibleToVote(int age, boolean isAmerican) {

        if (isAmerican && age > 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.err.println("You are not eligible to vote.");
        }

    }
}
/*
6. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
*/