package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        String[] arrOfStr = user_input.nextLine().split(", ");
        Integer[] numbers = new Integer[arrOfStr.length];

        for (int i = 0; i < arrOfStr.length; i++) {
            numbers[i] = Integer.parseInt(arrOfStr[i]);
        }

        for (int j = 1; j < numbers.length; j++) {
            for (int k = j; k > 0; k--) {
                if (numbers[k] > numbers[k - 1]) {
                    int temp = numbers[k];
                    numbers[k] = numbers[k - 1];
                    numbers[k - 1] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.println(numbers[i]);
            }
        }
    }
}
