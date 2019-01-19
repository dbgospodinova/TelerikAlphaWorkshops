package telerikalpha.workshop.loops;

import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Integer n = Integer.parseInt(userInput.nextLine());
        Double number;
        Double sum = 0.0;

        for (int i = 0; i < n; i++) {
            number = Double.parseDouble(userInput.nextLine());
            sum = sum + number;
        }

        System.out.printf("%.2f", sum / n);
    }
}
