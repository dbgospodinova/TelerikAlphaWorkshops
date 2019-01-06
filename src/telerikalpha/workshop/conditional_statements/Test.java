package telerikalpha.workshop.conditional_statements;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double text = in.nextDouble();
        double min = in.nextDouble();

        double diffText = Math.abs(text - 20);
        double diffMin = Math.abs(min - 60);
        double priceText = diffText * 0.06;
        double priceMin = diffMin * 0.10;
        double percentText = priceText * 0.20;
        double percentMin = priceMin * 0.20;
        double totalPercent = percentText + percentMin;
        double totalPriceText = priceText + percentText;
        double totalPriceMin = priceMin + percentMin;
        double totalPrice = totalPriceMin + totalPriceText + 12.00;

        if (text > 20 && min > 60) {
            System.out.printf("%.0f additional messages for %.2f levas%n%.0f additional minutes for %.2f levas%n%.2f additional taxes%n%.2f total bill", diffText, priceText, diffMin, priceMin, totalPercent, totalPrice);

        } else if (text <= 20 && min > 60) {
            totalPrice = priceMin + percentMin + 12.00;
            System.out.println("0 additional messages for 0.00 leva");
            System.out.printf("%.0f additional minutes for %.2f levas%n%.2f additional taxes%n%.2f total bill", diffMin, priceMin, percentMin, totalPrice);

        } else if (text > 20 && min <= 60) {
            totalPrice = priceText + percentText + 12.00;
            System.out.printf("%.0f additional messages for %.2f levas%n0 additional minutes for 0.00 levas%n%.2f additional taxes%n%.2f total bill",
                    diffText, priceText, percentText, totalPrice);

        } else {
            System.out.println("0 additional messages for 0.00 levas");
            System.out.println("0 additional minutes for 0.00 levas ");
            System.out.println("0.00 additional taxes");
            System.out.println("12.00 total bill");
        }

    }
}