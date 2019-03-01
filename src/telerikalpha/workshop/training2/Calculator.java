package telerikalpha.workshop.training2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double numberOne, numberTwo;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");

        /* We are using data type double so that user
         * can enter integer as well as floating point
         * value
         */
        numberOne = scanner.nextDouble();
        System.out.print("Enter second number: ");
        numberTwo = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch (operator) {
            case '+':
                output = numberOne + numberTwo;
                break;

            case '-':
                output = numberOne - numberTwo;
                break;

            case '*':
                output = numberOne * numberTwo;
                break;

            case '/':
                output = numberOne / numberTwo;
                break;

            /* If user enters any other operator or char apart from
             * +, -, * and /, then display an error message to user
             *
             */
            default:
                System.out.printf("You have entered wrong operator.");
                return;
        }

        System.out.println(numberOne + " " + operator + " " + numberTwo + " = " + output);
    }
}
