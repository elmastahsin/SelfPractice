package day13_customMethod;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        // int total = sum(20, 40);  // sum is a void method, does not return any data
        int n1 = 12;
        int n2 = 23;
        int total = addition(n1,n2);
        System.out.println("total = " + total);
        System.out.println(square(10));
        System.out.println(cube(10));
    }
    /*
        public static void sum(int n1, int n2){
            int result = n1 + n2;
            System.out.println(result);
        }
    */
    public static int addition (int num1, int num2){
        int result ;
        result = num1 + num2 ;
        return result;
    }
    public static int square( int num){
        int square = num * num;
        return square;
    }
    public static int cube (int num){
        int cube = square(num) * num ;
        return cube;
    }
}
