package telerikalpha.workshop.SolveProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFrom1toN {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int numberN = userInput.nextInt();
        ArrayList<String> output = new ArrayList<>();

        for(int i = 0; i < numberN; i++){
            output.add(String.valueOf(i + 1));
        }

        String result = String.join(" ", output);
        System.out.println(result);
    }
}
