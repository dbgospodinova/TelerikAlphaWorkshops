package telerikalpha.workshop.training;

import java.util.Scanner;

public class CheckForPlayCard {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        boolean cardPresent = false;
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for(int i = 0; i < cards.length; i++){
            if(input.equals(cards[i])){
                cardPresent = true;
                break;
            }
        }

        if(cardPresent){
            System.out.println("yes " + input);
        }else{
            System.out.println("no " + input);
        }
    }
}
