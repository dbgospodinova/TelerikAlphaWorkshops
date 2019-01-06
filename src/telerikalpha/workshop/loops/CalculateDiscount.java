package telerikalpha.workshop.loops;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        Integer n = Integer.parseInt(user_input.nextLine());
        Double item_price;
        Double discounted_price[] = new Double[n];
        NumberFormat formatter = new DecimalFormat("#0.00");

        for (int i = 0; i < n; i++) {
            item_price = Double.parseDouble(user_input.nextLine());
            discounted_price[i] = item_price * 0.35;
        }

        for (int j = 0; j < discounted_price.length; j++) {
            System.out.printf(formatter.format(discounted_price[j]) + "\n");
        }
    }
}
