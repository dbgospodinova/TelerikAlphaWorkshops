package telerikalpha.workshop.SolveProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String arrayLength = userInput.nextLine();
        int length = Integer.parseInt(arrayLength);
        double[] array = new double[length];
        double sum = 0.0;

        for(int i = 0; i < array.length; i++){
            array[i] = Double.parseDouble(userInput.nextLine());
            sum = sum + array[i];
        }

        Arrays.sort(array);

        double avg = sum / length;
        if(length >=1 && length <= 1000) {
            System.out.printf("min=%.2f\n", array[0]);
            System.out.printf("max=%.2f\n", array[length - 1]);
            System.out.printf("sum=%.2f\n", sum);
            System.out.printf("avg=%.2f\n", avg);
        }

    }
}
