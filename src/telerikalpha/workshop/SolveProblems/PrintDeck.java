package telerikalpha.workshop.SolveProblems;

import java.util.Scanner;

public class PrintDeck {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String cardSign = userInput.nextLine();

        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String temp = "";

        for (int i = 0; i < cards.length; i++) {
            if (!cardSign.equals(cards[i])) {
                temp = cards[i];
                System.out.printf(temp + " of spades, " + temp + " of clubs, " + temp +
                        " of hearts, " + temp + " of diamonds\n");
            }else if (cardSign.equals(cards[i])){
                temp = cards[i];
                System.out.printf(temp + " of spades, " + temp + " of clubs, " + temp +
                        " of hearts, " + temp + " of diamonds\n");
                break;
            }
        }
    }
}