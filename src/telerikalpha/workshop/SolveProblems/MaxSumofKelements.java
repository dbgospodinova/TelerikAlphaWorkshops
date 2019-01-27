package telerikalpha.workshop.SolveProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumofKelements {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int allNumbers = Integer.parseInt(userInput.nextLine());
        int numbers = Integer.parseInt(userInput.nextLine());
        int[] array = new int[allNumbers];
        for (int i = 0; i < allNumbers; i++) {
            array[i] = userInput.nextInt();
        }

        Arrays.sort(array);
        int sum = 0;

        for (int j = array.length - 1; j >= array.length - numbers; j--) {
            sum = sum + array[j];
        }

        System.out.println(sum);
    }
}
