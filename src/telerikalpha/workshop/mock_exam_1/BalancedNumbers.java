package telerikalpha.workshop.mock_exam_1;

import java.util.Scanner;

public class BalancedNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        boolean balancedNumber = true;
        Integer sum = 0;
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;

        while (balancedNumber) {
            String input = userInput.nextLine();
            Integer number = Integer.parseInt(input);
            firstDigit = number / 100;
            secondDigit = (number - firstDigit * 100) / 10;
            thirdDigit = number - firstDigit * 100 - secondDigit * 10;
            if (firstDigit + thirdDigit == secondDigit) {
                balancedNumber = true;
                sum = sum + number;
            } else {
                balancedNumber = false;
            }
        }

        System.out.println(sum);
    }
}
