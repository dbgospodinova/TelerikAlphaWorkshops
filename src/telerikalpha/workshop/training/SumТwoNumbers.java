package telerikalpha.workshop.training;

import java.util.Scanner;

public class SumТwoNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String firstNumber = userInput.nextLine();
        String secondNumber = userInput.nextLine();
        int sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        System.out.println(sum);
    }
}
