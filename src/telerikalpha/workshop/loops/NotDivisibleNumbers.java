package telerikalpha.workshop.loops;

import java.util.Scanner;

public class NotDivisibleNumbers {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        Integer n = Integer.parseInt(user_input.next());

        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 & i % 7 != 0) {
                if (i != 1) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
        }
    }
}
