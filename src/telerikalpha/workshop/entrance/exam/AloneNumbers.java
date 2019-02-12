package telerikalpha.workshop.entrance.exam;

import java.util.Scanner;

public class AloneNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] input = userInput.nextLine().split(", ");
        int[] firstArray = new int[input.length];
        int target = userInput.nextInt();

        for (int i = 0; i < input.length; i++) {
            firstArray[i] = Integer.parseInt(input[i]);
        }

        String[] result = new String[firstArray.length];
        result[0] = String.valueOf(firstArray[0]);
        result[firstArray.length - 1] = String.valueOf(firstArray[firstArray.length - 1]);

        for (int j = 1; j < firstArray.length - 1; j++) {
            if (firstArray[j] != firstArray[j - 1] && firstArray[j] != firstArray[j + 1] && firstArray[j] == target) {
                if (firstArray[j - 1] > firstArray[j + 1]) {
                    result[j] = String.valueOf(firstArray[j - 1]);
                } else if (firstArray[j - 1] < firstArray[j + 1]) {
                    result[j] = String.valueOf(firstArray[j + 1]);
                } else {
                    result[j] = String.valueOf(firstArray[j]);
                }
            } else {
                result[j] = String.valueOf(firstArray[j]);
            }
        }

        System.out.print("[");
        System.out.print(String.join(", ", result));
        System.out.println("]");
    }
}
