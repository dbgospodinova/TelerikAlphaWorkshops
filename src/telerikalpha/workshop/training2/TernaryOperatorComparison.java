package telerikalpha.workshop.training2;

import java.util.Scanner;

public class TernaryOperatorComparison {
    public static void main(String[] args) {
        int numberOne, numberTwo, numberThree, result, temp;
        /* Scanner is used for getting user input.
         * The nextInt() method of scanner reads the
         * integer entered by user.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        numberOne = scanner.nextInt();
        System.out.println("Enter the second number:");
        numberTwo = scanner.nextInt();
        System.out.println("Enter the third number:");
        numberThree = scanner.nextInt();
        scanner.close();


        /* In first step we are comparing only numberOne and
         * numberTwo and storing the largest number into the
         * temp variable and then comparing the temp and
         * numberThree to get final result.
         */
        temp = numberOne > numberTwo ? numberOne : numberTwo;
        result = numberThree > temp ? numberThree : temp;
        System.out.println("The largest number is: " + result);

        temp = numberOne < numberTwo ? numberOne : numberTwo;
        result = numberThree < temp ? numberThree : temp;
        System.out.println("The largest number is: " + result);

    }
}
