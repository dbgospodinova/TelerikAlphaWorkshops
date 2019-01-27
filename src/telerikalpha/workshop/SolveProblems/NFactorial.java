package telerikalpha.workshop.SolveProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class NFactorial {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int inputN = userInput.nextInt();
        BigInteger nFactorial = BigInteger.valueOf(1);
        for(int i = 2; i <= inputN; i++){
            nFactorial = nFactorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(nFactorial);
    }
}