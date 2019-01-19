package telerikalpha.workshop.loops;

import java.util.Scanner;

public class CalculateComplexSum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Integer n = Integer.parseInt(userInput.nextLine());
        Integer x = Integer.parseInt(userInput.nextLine());

        Double numerator = 1.0;
        Double denominator = 1.0;
        Double sum = 1.0;

        for (int i = 1; i <= n; i++) {
            numerator = numerator * i;
            denominator = denominator * x;
            sum = sum + (numerator / denominator);
        }

        System.out.printf("%.5f", sum);
    }
}
