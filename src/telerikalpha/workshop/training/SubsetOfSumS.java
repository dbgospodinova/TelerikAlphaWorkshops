package telerikalpha.workshop.training;

import java.util.Scanner;

public class SubsetOfSumS {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int sum = Integer.parseInt(userInput.nextLine());
        String[] input = userInput.nextLine().split(" ");
        int subset = 0;
        boolean output = false;

        for (int i = 0; i < input.length; i++) {
            int number = Integer.parseInt(input[i]);
            if (number <= sum && output == false) {
                for (int j = i; j < input.length; j++) {
                    int next = Integer.parseInt(input[j]);
                    subset = subset + next;
                    if (subset < sum) {
                        continue;
                    } else if (subset > sum) {
                        subset = 0;
                        continue;
                    } else {
                        output = true;
                        break;
                    }
                }
            }
        }
        if (output) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}