package telerikalpha.workshop.training;

import java.util.Scanner;

public class ExchangeIfGreater {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String firstNumber = userInput.nextLine();
        String secondNumber  = userInput.nextLine();
        String result = secondNumber + " " + firstNumber;

        if(firstNumber.equals(secondNumber)){
            System.out.println(result);
        }else if(Double.parseDouble(firstNumber) > Double.parseDouble(secondNumber)) {
            System.out.println(result);
        }else{
            System.out.println(firstNumber + " " + secondNumber);
        }
    }
}
