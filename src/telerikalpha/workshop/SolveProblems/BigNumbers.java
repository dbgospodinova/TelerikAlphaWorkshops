package telerikalpha.workshop.SolveProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BigNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] arrays = userInput.nextLine().split(" ");
        int firstLength = Integer.parseInt(arrays[0]);
        int secondLength = Integer.parseInt(arrays[1]);
        String firstNumber = userInput.nextLine();
        String secondNumber = userInput.nextLine();
        ArrayList<String> bigger = new ArrayList<String>();
        ArrayList<String> smaller = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();
        int sum = 0;
        int temp = 0;
        if (firstNumber.length() >= secondNumber.length()) {
            bigger = new ArrayList<>(Arrays.asList(firstNumber.split(" ")));
            smaller = new ArrayList<>(Arrays.asList(secondNumber.split(" ")));
        } else {
            bigger = new ArrayList<>(Arrays.asList(secondNumber.split(" ")));
            smaller = new ArrayList<>(Arrays.asList(firstNumber.split(" ")));
        }

        //System.out.println(bigger.size());
        //System.out.println(smaller.size());
        for (int i = 0; i <= bigger.size() - 1; i++) {
            if (i <= smaller.size() - 1) {
                sum = Integer.parseInt(bigger.get(i)) + Integer.parseInt(smaller.get(i)) + temp;
                if (sum / 10 > 0) {
                    result.add(String.valueOf(sum % 10));
                    temp = sum / 10;
                } else {
                    result.add(String.valueOf(sum));
                    temp = 0;
                }
            } else {
                sum = Integer.parseInt(bigger.get(i)) + temp;
                result.add(String.valueOf(sum % 10));
                temp = sum / 10;
            }
        }

        if(temp > 0){
            result.add("1");
        }

        for (int j = 0; j < result.size(); j++) {
            if (j < result.size() - 1) {
                System.out.print(result.get(j) + " ");
            } else {
                System.out.print(result.get(j));
            }
        }

    }
}
