package telerikalpha.workshop.entrance.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] input = userInput.nextLine().split(" ");
        ArrayList<Long> numbers = new ArrayList<>();
        long temp = 0;

        for (int i = 0; i < input.length; i++) {
            temp = Integer.parseInt(input[i]);
            if (temp % 3 == 0) {
                if (temp % 7 == 0) {
                    numbers.add(temp);
                }
            }
        }

        long tempSum = 0;
        long sum = 0;


        for (int j = 0; j < numbers.size(); j++) {
            tempSum = tempSum + numbers.get(j);
        }

        //System.out.println(tempSum);

        while ( tempSum > 0) {
            sum = sum + tempSum % 10;
            tempSum = tempSum / 10;
        }

        System.out.println(sum);
    }
}
