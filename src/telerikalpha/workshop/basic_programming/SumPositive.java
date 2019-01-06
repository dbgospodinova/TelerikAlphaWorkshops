package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String input = user_input.next();
        int sum_possitive = Integer.parseInt(input);

        int sum = sum_possitive*(sum_possitive+1)/2;

        System.out.println(sum);
    }
}
