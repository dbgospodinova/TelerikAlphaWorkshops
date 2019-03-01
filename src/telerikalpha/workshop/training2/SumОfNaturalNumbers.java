package telerikalpha.workshop.training2;

import java.util.Scanner;

public class SumОfNaturalNumbers {
    public static void main(String[] args) {
        int number, count, total = 0;

        //First program
        System.out.println("Enter the value of n:");
        //Scanner is used for reading user input
        Scanner scan = new Scanner(System.in);
        //nextInt() method reads integer entered by user
        number = scan.nextInt();
        //closing scanner after use
        scan.close();
        for (count = 1; count <= number; count++) {
            total = total + count;
        }

        System.out.println("Sum of first " + number + " natural numbers is: " + total);

        //Second program
        total = 0;
        for (count = 1; count <= number; count++) {
            total = total + count;
        }

        System.out.println("Sum of first 10 natural numbers is: " + total);

        //Third program
        total = 0;
        count = 1;
        while (count <= number) {
            total = total + count;
            count++;
        }

        System.out.println("Sum of first 10 natural numbers is: " + total);
    }
}
