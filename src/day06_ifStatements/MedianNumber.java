package day06_ifStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        boolean aIsMedian = (a > c && a < b) || (a < c && a > b);
        boolean bIsMedian = (b < c && b > a) || (b > c && b < a) ;
        boolean cIsMedian = !aIsMedian && !bIsMedian ; //(c<a && c>b)||(c<b && c>a);

        String result = "";
        if (aIsMedian){
            result = a + " is the median number";
        }
        if (bIsMedian){
            result = b+ " is the median number";
        }
        if (cIsMedian){
            result =c+" is the median number";
        }
        System.out.println(result);

    }

}

/*
Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers
		Ex:
                a = 10, b= 15, c = 20;
            Output:
                15 is the median number
 */