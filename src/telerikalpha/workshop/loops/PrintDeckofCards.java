package telerikalpha.workshop.loops;

import java.util.Scanner;

public class PrintDeckofCards {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        String card_sign = user_input.next();
        String card_face;

        switch (card_sign) {
            case "2":
                card_face = "1";
                break;
            case "3":
                card_face = "2";
                break;
            case "4":
                card_face = "3";
                break;
            case "5":
                card_face = "4";
                break;
            case "6":
                card_face = "5";
                break;
            case "7":
                card_face = "6";
                break;
            case "8":
                card_face = "7";
                break;
            case "9":
                card_face = "8";
                break;
            case "10":
                card_face = "9";
                break;
            case "J":
                card_face = "10";
                break;
            case "Q":
                card_face = "11";
                break;
            case "K":
                card_face = "12";
                break;
            case "A":
                card_face = "13";
                break;
            default:
                card_face = "";
                break;
        }
        Integer card = Integer.parseInt(card_face);

        for (int i = 0; i < card; i++) {
            String temp = cards[i];
            System.out.printf(temp + " of spades, " + temp + " of clubs, " + temp +
                    " of hearts, " + temp + " of diamonds\n", temp);
        }
    }
}
