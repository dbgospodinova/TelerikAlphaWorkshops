package telerikalpha.workshop.SolveProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculate3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int numberN = userInput.nextInt();
        int numberK = userInput.nextInt();
        BigInteger factorialN = BigInteger.valueOf(1);
        BigInteger temp = BigInteger.valueOf(1);

        for (int i = numberN; i > numberK; i--) {
            factorialN = factorialN.multiply(BigInteger.valueOf(i));
        }

        for(int j = 1; j <= (numberN - numberK); j++){
            temp = temp.multiply(BigInteger.valueOf(j));
        }

        //System.out.println(factorialN);
        //System.out.println(temp);
        BigInteger result = factorialN.divide(temp);
        System.out.println(result);
    }
}
