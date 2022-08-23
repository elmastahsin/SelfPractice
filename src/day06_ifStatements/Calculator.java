package day06_ifStatements;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 10;
        double n2 = 20;
        char add = '+';
        char minus = '-';
        char multpy = '*';
        char divide = '/';
        double result = 0;
        char mathOperator = '+';


        if (mathOperator == add) {
            result = n1 + n2;
        }
        if (mathOperator == minus) {
            result = n1 - n2;
        }
        if (mathOperator == multpy) {
            result = n1 * n2;
        }
        if (mathOperator == divide) {
            result = n1 / n2;
        }
        System.out.println("result = " + result);
    }
}
