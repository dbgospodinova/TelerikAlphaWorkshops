package telerikalpha.workshop.training;

import java.math.BigDecimal;
import java.util.Scanner;

public class CartesianCoordinates {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        BigDecimal xUnformatted = new BigDecimal(userInput.nextLine());
        BigDecimal yUnformatted = new BigDecimal(userInput.nextLine());
        BigDecimal zero = new BigDecimal(0);

        xUnformatted = BigDecimal.valueOf(xUnformatted.compareTo(zero));
        int x = xUnformatted.intValueExact();

        yUnformatted = BigDecimal.valueOf(yUnformatted.compareTo(zero));
        int y = yUnformatted.intValueExact();


        if (x == 0 && y == 0) {
            System.out.println(0);
        } else if(x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        } else if (x == 0) {
            System.out.println(5);
        } else if (y == 0) {
            System.out.println(6);
        }
    }
}