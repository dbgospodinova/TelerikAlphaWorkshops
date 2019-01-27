package telerikalpha.workshop.training;

import java.util.Scanner;

public class CombineLists {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] firstList = userInput.nextLine().split(",");
        String[] secondList = userInput.nextLine().split(",");
        String result = "";

        for (int i = 0; i < firstList.length; i++) {
            if (i == (firstList.length - 1)) {
                result = result + firstList[i] + ",";
                result = result + secondList[i];
            } else {
                result = result + firstList[i] + ",";
                result = result + secondList[i] + ",";
            }
        }
        System.out.println(result);

        //Print Arrays joined by delimiter - works for Strings
        //System.out.println(String.join(",", firstList));

    }
}