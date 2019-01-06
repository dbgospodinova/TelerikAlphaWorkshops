package telerikalpha.workshop.loops;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        Integer non_prime_number = Integer.parseInt(user_input.next());

        for (int i = 2; i <= non_prime_number; i++) {
            while (non_prime_number % i == 0) {
                System.out.println(i + " ");
                non_prime_number = non_prime_number / i;
            }
        }
    }
}
