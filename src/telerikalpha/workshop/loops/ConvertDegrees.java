package telerikalpha.workshop.loops;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertDegrees {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();

        String[] arrays = input.split("\\s+");
        int[] array = Arrays.asList(arrays).stream().mapToInt(Integer::parseInt).toArray();

        for (Integer degreesFahrenheit : array) {
            double degrees = degreesFahrenheit * 1.8 + 32;
            if (degrees % 1.0 != 0.0) {
                System.out.printf("%.1f\n", degrees);
            } else {
                System.out.printf("%.0f\n", degrees);
            }
        }
    }
}