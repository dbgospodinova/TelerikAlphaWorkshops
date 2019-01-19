package telerikalpha.workshop.conditional_statements;

import java.util.Scanner;

public class ChessSquareColor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String userInputFile = userInput.next();

        userInput.nextLine();
        String userInputRank = userInput.next();
        Integer inputRank = Integer.parseInt(userInputRank);

        if (userInputFile.matches("([abcdefgh])") & (inputRank >= 1 & inputRank <= 8)) {
            if ((userInputFile.matches("([aceg])") & userInputRank.matches("([1357])")) |
                    (userInputFile.matches("([bdfh])") & userInputRank.matches("([2468])"))){
                System.out.println("dark");

            }else{
                System.out.println("light");
            }
        }
    }
}

