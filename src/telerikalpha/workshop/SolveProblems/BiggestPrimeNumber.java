package telerikalpha.workshop.SolveProblems;

import java.util.Scanner;

public class BiggestPrimeNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int numberN = userInput.nextInt();

        int maxPrimeNumber = 0;
        for(int i = numberN ; i >= numberN/2; i--){
            if(isPrime(i)){
                maxPrimeNumber = i;
                break;
            }
        }

        System.out.println(maxPrimeNumber);
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }

}
