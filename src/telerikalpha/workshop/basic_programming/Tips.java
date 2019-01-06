package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String input_bill = user_input.next();
        double bill = Double.parseDouble(input_bill);
        double tip = bill*0.1;
        double total_sum = bill+tip;

        System.out.println((int)total_sum);
    }
}
