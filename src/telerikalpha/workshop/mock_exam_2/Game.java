package telerikalpha.workshop.mock_exam_2;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Integer number = Integer.parseInt(userInput.nextLine());

        Integer firstDigit = number / 100;
        Integer secondDigit = (number - firstDigit * 100) / 10;
        Integer thirdDigit = number - firstDigit * 100 - secondDigit * 10;

        Integer[] combinations = new Integer[4];
        combinations[0] = firstDigit + secondDigit + thirdDigit;
        combinations[1] = firstDigit * secondDigit * thirdDigit;
        combinations[2] = firstDigit + secondDigit * thirdDigit;
        combinations[3] = firstDigit * secondDigit + thirdDigit;

        Arrays.sort(combinations);

        System.out.println(combinations[3]);
    }
}

