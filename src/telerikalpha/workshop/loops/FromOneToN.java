package telerikalpha.workshop.loops;

import java.util.Scanner;

public class FromOneToN {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        Integer n = Integer.parseInt(user_input.next());

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i != n) {
                System.out.print(" ");
            }
        }
    }
}
