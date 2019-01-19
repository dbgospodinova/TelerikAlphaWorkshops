package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class BottleDeposit {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        String inputSmallBottles = userInput.next();
        int smallBottles = Integer.parseInt(inputSmallBottles);

        userInput.nextLine();
        String inputBigBottles = userInput.next();
        int bigBottles = Integer.parseInt(inputBigBottles);

        double deposit = smallBottles*0.1 + bigBottles*0.25;
        System.out.printf("%.2f",deposit);
    }
}
