package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String inputBill = userInput.next();
        double bill = Double.parseDouble(inputBill);
        double tip = bill*0.1;
        double totalSum = bill+tip;

        System.out.println((int)totalSum);
    }
}
