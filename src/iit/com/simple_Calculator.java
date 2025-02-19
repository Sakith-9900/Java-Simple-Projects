package iit.com;

import java.util.Scanner;

public class simple_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        double num1 = input.nextDouble();
        System.out.println("Enter the operator '+,-,*,/' : ");
        char operator = input.next().charAt(0);
        System.out.println("Enter your second number :");
        double num2 = input.nextDouble();

        double result= 0;

        switch (operator) {
            case '+':
                result = num1 + num2;

                break;
            case '-':
                result = num1 - num2;

                break;
            case '*':
                result = num1 * num2;

                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;


                } else {
                    System.out.println("Zero division error");
                    break;
                }
            default:
                System.out.println("invalid operator");
                input.close();
                return;
        }
        System.out.println("Result : "+ result);
        input.close();



    }
}

