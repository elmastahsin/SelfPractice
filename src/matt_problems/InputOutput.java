package matt_problems;

import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4 number: ");
        int[] numbers = new int[4];
        // int[] numbers = {5,1,4,2};
        for (int i = 0; i < numbers.length; i++) { // user input
            numbers[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(function(numbers)));
    }

    public static int[] function(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < result.length; i++) {
            result[i]=1;
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = result.length - 1; j >=0 ; j--) {
                if (i!=j){
                    result[i] *= numbers[j];
                }else {
                    continue;
                }

            }
        }
        return result;
    }
}
