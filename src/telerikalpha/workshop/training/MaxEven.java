package telerikalpha.workshop.training;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxEven {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();

        ArrayList<Integer> numbers = new ArrayList<>();
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(input);
        while (m.find()) {
            numbers.add(Integer.parseInt(m.group()));
        }

        int maxEven = -1;

        for (int item : numbers) {
            if (item % 2 == 0 && item > maxEven) {
                maxEven = item;
            }
        }

        System.out.println(maxEven);
    }
}