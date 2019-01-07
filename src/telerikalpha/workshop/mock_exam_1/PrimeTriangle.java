package telerikalpha.workshop.mock_exam_1;

import java.util.Scanner;

public class PrimeTriangle {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        Integer n = Integer.parseInt(user_input.nextLine());

        for (int k = 1; k <= n; k++) {
            if (isPrime(k)) {
                for (int l = 1; l <= k; l++) {
                    if (isPrime(l)) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                    if (l < k) {
                        System.out.print("");
                    }
                }
                System.out.println();
            }
        }
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
