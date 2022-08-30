package day08_terninary_switch;

public class Calculator {
    public static void main(String[] args) {
        char operator = '+';
        int num1=23;
        int num2=32;
        int result = 0;
        String r ="";
        switch(operator){
            case '+': result = num1+num2;break;
            case '-': result = num1 - num2; break;
            case '*': result = num1* num2; break;
            case '/': result = num1/num2; break;
            default: r= "Invalid Operators"; break;
        }
        System.out.println("result = " + result +r);
       /* boolean isOperator = operator =='+'||operator=='-'||operator=='*'||operator=='/';
        if (isOperator) {
            result = (operator == '+') ? num1 + num2
                    : (operator == '-') ? num1 - num2
                    : (operator == '*') ? num1 * num2
                    : num1 / num2;
        }else {
            System.out.println("Invalid Operators");
        }
            System.out.println("result = " + result);*/
        }
    }

/*
7. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

		Note: MUST use switch statement*/