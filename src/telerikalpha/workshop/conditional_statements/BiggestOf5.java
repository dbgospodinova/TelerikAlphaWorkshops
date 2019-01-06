package telerikalpha.workshop.conditional_statements;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestOf5 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        Float arrayOfNumbers[] = new Float[5];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            String user_input_number = user_input.next();
            float number = Float.valueOf(user_input_number);
            arrayOfNumbers[i] = number;
            user_input.nextLine();
        }

        Arrays.sort(arrayOfNumbers);

        if (arrayOfNumbers[0] >= -200 & arrayOfNumbers[4] <= 200) {
            if (arrayOfNumbers[4] % 1.0 != 0) {
                System.out.printf("%s", arrayOfNumbers[4]);
            } else {
                System.out.printf("%.0f", arrayOfNumbers[4]);
            }
        }
    }
}
