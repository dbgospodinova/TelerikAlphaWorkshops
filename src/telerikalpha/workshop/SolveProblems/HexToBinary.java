package telerikalpha.workshop.SolveProblems;

//The solution is slow. Need refactoring using StringBuilder and some improvements

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] input = userInput.nextLine().split("");
        int value = 0;
        String output = "";
        String currentBinary = "";
        ArrayList<String> result = new ArrayList<>();

        ArrayList<String> hexValues = new ArrayList<>
                (Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"));


        for (int i = 0; i < input.length; i++) {
            String currentChar = input[i];
            value = hexValues.indexOf(currentChar);
            for (int j = 0; j < 4; j++) {
                currentBinary = value % 2 + currentBinary;
                value /= 2;
            }
            result.add(currentBinary);
            currentBinary = "";
        }

        for (int i = 0; i < result.size();i ++){
            output = output + result.get(i);
        }


        for (int i = 0; i < output.length();i ++){
            if(output.startsWith("0")){
                output = output.substring(1);
            }else{
                break;
            }
        }
        System.out.println(output);

    }
}