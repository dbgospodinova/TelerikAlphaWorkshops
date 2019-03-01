package telerikalpha.workshop.training2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        long fact = 1;
        int i;


        //First program
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);

        //Second program
        i = 1;
        fact = 1;
        while (i <= number) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
