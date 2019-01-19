package telerikalpha.workshop.mock_exam_1;

import java.util.Scanner;

public class CrookedDigits {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] input = userInput.nextLine().replaceAll("[-.,]", "").split("");
        int number = 0;
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            number = number + Integer.parseInt(input[i]);
        }
        //System.out.println(number);

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        //System.out.println(sum);

        if (sum > 10) {
            number = sum;
            sum = 0;
            while (number > 0) {
                sum = sum + number % 10;
                number = number / 10;
            }
        }

        System.out.println(sum);

    }
}
