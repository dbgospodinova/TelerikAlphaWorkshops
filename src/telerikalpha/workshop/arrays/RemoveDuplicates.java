package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] input = userInput.next().split(",");

        int occurrence = 0;
        String result = "";

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i].equals(input[j])) {
                    occurrence++;
                    if (occurrence == 1 & input[j].equals("duplicate") != true) {
                        result = result + input[i] + ",";
                    } else {
                        input[j] = "duplicate";
                    }
                }
            }
            occurrence = 0;
        }

        if (result.endsWith(",")) {
            System.out.println(result.substring(0, result.length() - 1));
        }
    }
}
