package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String[] input = userInput.nextLine().split(", ");

        for (int i = input.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(input[i] + ", ");
            } else {
                System.out.print(input[i]);
            }
        }
    }
}
