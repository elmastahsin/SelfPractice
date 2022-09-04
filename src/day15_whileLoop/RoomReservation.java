package day15_whileLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to reserve a room ? ");
        String answer = input.next().toLowerCase();
        while (!(answer.equals("yes")||answer.equals("no"))){
            System.out.println("Would you like to reserve a room ? ");
            String answer = input.next().toLowerCase();
        }
        if (answer.equals("yes")) {

            System.out.println("Which room would you like to select?");
            System.out.println("\t\tKing Bed == $120");
            System.out.println("\t\tQueen Bed == $100");
            System.out.println("\t\tSingle Bed == $80");

            String room = input.nextLine().toLowerCase();

            if (room =)
        }else if (answer.equals("no")){
            System.out.println();
        }

    }
}
/*8. Create a class called RommReservation,
 write a program for the room reservation,
 your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve.
    if user entered no, print "have a nice day"
 			(if user entered any invalid answer (other than yes/no) ask user to
    	reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room
            he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to
            reselect the room until user provides a valid entry)*/