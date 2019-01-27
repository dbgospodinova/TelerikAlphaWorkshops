package telerikalpha.workshop.training;

import java.math.BigInteger;
import java.util.Scanner;

public class CalculateAgain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int numberN = Integer.parseInt(userInput.nextLine());
        int numberK = Integer.parseInt(userInput.nextLine());

        BigInteger result = BigInteger.valueOf(1);

        for (int i = numberN; i > numberK; i--) {
            result =  result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }
}
