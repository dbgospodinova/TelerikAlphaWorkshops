package telerikalpha.workshop.loops;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSumAndAverage {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Integer n =Integer.parseInt(userInput.nextLine());
        Double arrayOfNumbers[] = new Double[n];
        Double sum = 0.0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            Double number = Double.parseDouble(userInput.nextLine());
            arrayOfNumbers[i] = number;
            sum = sum + arrayOfNumbers[i];
        }

        Arrays.sort(arrayOfNumbers);

        System.out.printf("min=%.2f\n",arrayOfNumbers[0]);
        System.out.printf("max=%.2f\n",arrayOfNumbers[n - 1]);
        System.out.printf("sum=%.2f\n",sum);
        System.out.printf("avg=%.2f",sum / n);
    }
}

