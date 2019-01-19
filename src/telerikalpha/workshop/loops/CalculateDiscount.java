package telerikalpha.workshop.loops;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Integer n = Integer.parseInt(userInput.nextLine());
        Double itemPrice;
        Double discountedPrice[] = new Double[n];
        NumberFormat formatter = new DecimalFormat("#0.00");

        for (int i = 0; i < n; i++) {
            itemPrice = Double.parseDouble(userInput.nextLine());
            discountedPrice[i] = itemPrice * 0.35;
        }

        for (int j = 0; j < discountedPrice.length; j++) {
            System.out.printf(formatter.format(discountedPrice[j]) + "\n");
        }
    }
}
