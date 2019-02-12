package telerikalpha.workshop.training2;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] input = userInput.nextLine().split(" ");
        String[] number = input[0].split("");
        int numberK = Integer.parseInt(input[1]);
        String[] temp = new String[number.length];

        for (int i = 0; i < number.length; i++) {
            temp[i] = number[number.length - i - 1];
        }

        String output = String.join("", temp);
        int numberN = Integer.parseInt(output);

        int result = numberN / numberK + numberN % numberK;

        System.out.println(result);
    }
}