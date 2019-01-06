package telerikalpha.workshop.loops;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargestThreeValues {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        Integer n = Integer.parseInt(user_input.nextLine());

        Integer[] numbers = new Integer[n];

        for(int i = 0; i < n; i ++){
            numbers[i] = Integer.parseInt(user_input.nextLine());
        }

        Arrays.sort(numbers);

        if (numbers[0] >= -500 & numbers[n-1] <= 500){
            System.out.println(numbers[n-1] + ", " + numbers[n-2] + " and " + numbers[n-3  ]);
        }
    }
}
