package telerikalpha.workshop.training;

import java.util.Scanner;

public class NotDivisableNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        String result = "1";
        for(int i = 2; i <= number; i++){
            if(i % 3 != 0) {
                if (i % 7 != 0) {
                    result = result + " " + i;
                }
            }
        }
        System.out.println(result);
    }
}
