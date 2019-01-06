package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class BottleDeposit {
    public static void main(String[] args){

        Scanner user_input = new Scanner(System.in);
        String input_small_bottles = user_input.next();
        int small_bottles = Integer.parseInt(input_small_bottles);

        user_input.nextLine();
        String input_big_bottles = user_input.next();
        int big_bottles = Integer.parseInt(input_big_bottles);

        double deposit = small_bottles*0.1 + big_bottles*0.25;
        System.out.printf("%.2f",deposit);
    }
}
