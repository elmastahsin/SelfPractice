package day22_wrapperClasses;

public class MaxAndMinumum {
    public static void main(String[] args) {
        int [] list = {1,2,3,4,5};
        System.out.println(max(list));
        System.out.println(min(list));
    }
    public static int max(int [] list){
        int max = -2147483648;
        for (int i = 0; i < list.length; i++) {
            if (list[i]>max){
                max=list[i];
            }
        }
        return max;
    }
    public static int min(int [] list){
        int min = 2147483647;
        for (int i = 0; i < list.length; i++) {
            if (list[i]<min){
                min=list[i];
            }
        }
        return min;
    }
}
/*8. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1

*/