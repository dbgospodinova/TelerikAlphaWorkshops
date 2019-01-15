package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class BelowAndAboveAverage {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String[] arrOfStr = user_input.next().split(",");
        Double[] numbers = new Double[arrOfStr.length];
        double sum = 0;

        for (int i = 0; i < arrOfStr.length; i++) {
            numbers[i] = Double.parseDouble(arrOfStr[i]);
            sum = sum + numbers[i];
        }

        double avg = sum / arrOfStr.length;

        String below = "";
        String above = "";

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] < avg) {
                below = below + numbers[j].intValue() + ",";
                //System.out.println(below);
            } else if (numbers[j] > avg) {
                above = above + numbers[j].intValue() + ",";
                //System.out.println(above);
            }

        }

        System.out.printf("avg: " + "%.2f\n", avg);
        if (below.endsWith(",")) {
            System.out.println("below: " + below.substring(0, below.length() - 1));
        }

        if (above.endsWith(",")) {
            System.out.println("above: " + above.substring(0, above.length() - 1));
        }
    }
}
