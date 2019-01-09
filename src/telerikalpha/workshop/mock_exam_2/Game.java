package telerikalpha.workshop.mock_exam_2;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        Integer number = Integer.parseInt(user_input.nextLine());

        Integer first_digit = number / 100;
        Integer second_digit = (number - first_digit * 100) / 10;
        Integer third_digit = number - first_digit * 100 - second_digit * 10;

        Integer[] combinations = new Integer[4];
        combinations[0] = first_digit + second_digit + third_digit;
        combinations[1] = first_digit * second_digit * third_digit;
        combinations[2] = first_digit + second_digit * third_digit;
        combinations[3] = first_digit * second_digit + third_digit;

        Arrays.sort(combinations);

        System.out.println(combinations[3]);
    }
}

