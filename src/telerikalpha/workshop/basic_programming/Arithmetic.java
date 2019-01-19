package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String inputA = userInput.next();
        int a = Integer.parseInt(inputA);

        userInput.nextLine();

        String inputB = userInput.next();
        int b = Integer.parseInt(inputB);

        int sum = a +b;
        int difference = a - b;
        int product = a * b;
        int reminder = a % b;
        int result = (int)Math.pow(a, b);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(reminder);
        System.out.println(result);

    }
}
