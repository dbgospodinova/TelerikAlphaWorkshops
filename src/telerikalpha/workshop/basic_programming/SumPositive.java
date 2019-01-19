package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String input = userInput.next();
        int sumPossitive = Integer.parseInt(input);

        int sum = sumPossitive*(sumPossitive+1)/2;

        System.out.println(sum);
    }
}
