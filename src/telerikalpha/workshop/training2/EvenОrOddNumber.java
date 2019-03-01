package telerikalpha.workshop.training2;

import java.util.Scanner;

public class EvenОrOddNumber {
    public static void main(String args[]) {
        int number;
        System.out.println("Enter an Integer number:");

        //The input provided by user is stored in number
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        /* If number is divisible by 2 then it's an even number
         * else odd number*/
        if (number % 2 == 0)
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
    }
}
