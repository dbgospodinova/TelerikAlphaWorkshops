package telerikalpha.workshop.loops;

import java.util.Scanner;

public class MatrixNumbers {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        Integer n = Integer.parseInt(user_input.next());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n + i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
