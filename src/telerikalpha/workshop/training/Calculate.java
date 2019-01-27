package telerikalpha.workshop.training;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double n = Double.parseDouble(userInput.nextLine());
        double x = Double.parseDouble(userInput.nextLine());
        Double factorial = 1.0;
        Double sqr = 1.0;
        Double sum = 1.0;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            sqr = sqr * x;
            sum = sum + (factorial / sqr);
        }

        System.out.printf("%.5f", sum);
    }
}

