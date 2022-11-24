package SelfPracticeInMentorTraining;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height od the diamond: ");
        int height = input.nextInt();
        int mid = (height + 1) / 2;
        for (int i = 1; i <= mid; ++i) {
            printLine(i, height);
        }
        for (int i = mid - 1; i >= 0; --i) {
            printLine(i, height);
        }
    }

    public static void printLine(int i, int height) {
        int stars = (2 * i) - 1;
        int space = (height - stars) / 2;
        for (int j = space; j > 0; --j) {
            System.out.print("  ");
        }


        for (int j = stars; j > 0; --j) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
