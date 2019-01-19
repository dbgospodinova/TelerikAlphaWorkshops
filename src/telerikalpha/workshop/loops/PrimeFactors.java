package telerikalpha.workshop.loops;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Integer nonPrimeNumber = Integer.parseInt(userInput.next());

        for (int i = 2; i <= nonPrimeNumber; i++) {
            while (nonPrimeNumber % i == 0) {
                System.out.println(i + " ");
                nonPrimeNumber = nonPrimeNumber / i;
            }
        }
    }
}
