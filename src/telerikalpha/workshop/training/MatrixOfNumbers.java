package telerikalpha.workshop.training;

import java.util.Scanner;

public class MatrixOfNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }
}
