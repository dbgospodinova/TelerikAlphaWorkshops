package telerikalpha.workshop.mock_exam_1;

import java.util.Scanner;

public class BalancedNumbers {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        boolean balanced_number = true;
        Integer sum = 0;
        Integer[] digits = new Integer[3];
        int first_digit = 0;
        int second_digit = 0;
        int third_digit = 0;

        while (balanced_number) {
            String input = user_input.nextLine();
            Integer number = Integer.parseInt(input);
            first_digit = number / 100;
            second_digit = (number - first_digit * 100) / 10;
            third_digit = number - first_digit * 100 - second_digit * 10;
            if (first_digit + third_digit == second_digit) {
                balanced_number = true;
                sum = sum + number;
            } else {
                balanced_number = false;
            }
        }

        System.out.println(sum);
    }
}
