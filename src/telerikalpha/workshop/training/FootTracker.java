package telerikalpha.workshop.training;

import java.util.Scanner;

public class FootTracker {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int miles = userInput.nextInt();
        int meters = miles * 1609;
        System.out.println(meters);
    }
}
