package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class StrangeOrder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] input = userInput.next().split(",");
        String negative = "";
        String zeros = "";
        String possitive = "";

        for (int i = 0; i < input.length; i++) {
            int number = Integer.parseInt(input[i]);
            if (number < 0) {
                negative = negative + number + ",";
            } else if (number == 0) {
                zeros = zeros + number + ",";
            } else {
                possitive = possitive + number + ",";
            }
        }

        String result = negative + zeros + possitive;

        if (result.endsWith(",")) {
            System.out.println(result.substring(0, result.length() - 1));
        }
    }
}
