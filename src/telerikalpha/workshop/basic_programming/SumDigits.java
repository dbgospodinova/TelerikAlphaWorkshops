package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userInputNumber = userInput.next();

        int number = Integer.parseInt(userInputNumber);
        String[] digits = userInputNumber.split("");
        int sum=0;

        if(1000 <= number & number <= 9999){
            for (int i = 0; i < digits.length; i++){
                int digit = Integer.parseInt(digits[i]);
                sum = sum + digit;
            }
            System.out.println(sum);
        }

    }
}
