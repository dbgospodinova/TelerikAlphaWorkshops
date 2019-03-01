package telerikalpha.workshop.arrays_tasks;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] input = userInput.nextLine().split(" ");


        for (int i = input.length - 1; i > 0; i--) {
            System.out.print(input[i] + ", ");
        }

        System.out.println(input[0]);

    }
}

