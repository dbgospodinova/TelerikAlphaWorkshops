package telerikalpha.workshop.conditional_statements;

import java.util.Scanner;

public class DogYears {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userInputHy = userInput.next();

        int humanYears = Integer.parseInt(userInputHy);

        int dogYears = 0;

        if(1 <= humanYears & humanYears <= 15){
            for (int i = 0; i < humanYears; i++) {
                if (i < 2) {
                    dogYears = dogYears + 10;
                } else {
                    dogYears = dogYears + 4;
                }
            }
            System.out.println(dogYears);
        }
    }
}
