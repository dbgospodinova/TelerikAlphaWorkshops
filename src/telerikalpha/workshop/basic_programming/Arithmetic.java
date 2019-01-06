package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String input_a = user_input.next();
        int a = Integer.parseInt(input_a);

        user_input.nextLine();

        String input_b = user_input.next();
        int b = Integer.parseInt(input_b);

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
