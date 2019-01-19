package telerikalpha.workshop.loops;

import java.util.Scanner;

public class FromOneToN {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Integer n = Integer.parseInt(userInput.next());

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i != n) {
                System.out.print(" ");
            }
        }
    }
}
