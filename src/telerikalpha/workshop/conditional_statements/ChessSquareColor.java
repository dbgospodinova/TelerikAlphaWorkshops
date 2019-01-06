package telerikalpha.workshop.conditional_statements;

import java.util.Scanner;

public class ChessSquareColor {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String user_input_file = user_input.next();

        user_input.nextLine();
        String user_input_rank = user_input.next();
        Integer input_rank = Integer.parseInt(user_input_rank);

        if (user_input_file.matches("([abcdefgh])") & (input_rank >= 1 & input_rank <= 8)) {
            if ((user_input_file.matches("([aceg])") & user_input_rank.matches("([1357])")) |
                    (user_input_file.matches("([bdfh])") & user_input_rank.matches("([2468])"))){
                System.out.println("dark");

            }else{
                System.out.println("light");
            }
        }
    }
}

