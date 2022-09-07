package day16_DoWhile;

public class NestedLoopStar {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < (i); j++) {
                System.out.print("* ");
                
            }
        }
    }
}
/*
* 1. Use a nested loop to print the following shape

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * * * *
 * * * * * * * * *
 * * * * * * * * * *
 */
