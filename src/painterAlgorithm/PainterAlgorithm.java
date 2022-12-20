package painterAlgorithm;

import java.util.Scanner;

public class PainterAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        int column = input.nextInt();
        int row=input.nextInt();
        int circleNumber = input.nextInt();
        int statistics = input.nextInt();
        
        int [][][] canvas = new int[row+1][column+1][2];

        for (int i = row; i > 0; i--) {
            for (int j = 1; j <= column; j++) {
                canvas[i][j][0] = '-';
                canvas[i][j][1] = Integer.MAX_VALUE;
            }
        }
        for (int i = row; i > 0; i--) {
            for (int j = 0; j < column; j++) {
                System.out.print(canvas[i][j][0]+canvas[i][j][0]);
            }
            System.out.println();
        }
    }
}
