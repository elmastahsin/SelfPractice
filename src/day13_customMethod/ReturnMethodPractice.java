package day13_customMethod;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        int num = 12;
        isOdd(num);

    }
    public static boolean isOdd(int num){
        boolean isOdd =false;
        if(num % 2== 0){
            isOdd = true;
        }
        return isOdd;
    }

}
/*
Create a method named isOdd, that can return true if a number is an odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */
