package telerikalpha.workshop.loops;

import java.util.Scanner;

public class PrintDeckofCards {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        String cardSign = userInput.next();
        String cardFace;

        switch (cardSign) {
            case "2":
                cardFace = "1";
                break;
            case "3":
                cardFace = "2";
                break;
            case "4":
                cardFace = "3";
                break;
            case "5":
                cardFace = "4";
                break;
            case "6":
                cardFace = "5";
                break;
            case "7":
                cardFace = "6";
                break;
            case "8":
                cardFace = "7";
                break;
            case "9":
                cardFace = "8";
                break;
            case "10":
                cardFace = "9";
                break;
            case "J":
                cardFace = "10";
                break;
            case "Q":
                cardFace = "11";
                break;
            case "K":
                cardFace = "12";
                break;
            case "A":
                cardFace = "13";
                break;
            default:
                cardFace = "";
                break;
        }
        Integer card = Integer.parseInt(cardFace);

        for (int i = 0; i < card; i++) {
            String temp = cards[i];
            System.out.printf(temp + " of spades, " + temp + " of clubs, " + temp +
                    " of hearts, " + temp + " of diamonds\n", temp);
        }
    }
}
