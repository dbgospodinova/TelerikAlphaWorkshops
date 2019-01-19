package telerikalpha.workshop.conditional_statements;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Integer year = Integer.parseInt(userInput.next());

        int zodiac = year % 12;
        String zodiacSign;


        switch (zodiac) {
            case 0: zodiacSign = "Monkey";
                break;
            case 1: zodiacSign = "Rooster";
                break;
            case 2:  zodiacSign = "Dog";
                break;
            case 3:  zodiacSign = "Pig";
                break;
            case 4:  zodiacSign = "Rat";
                break;
            case 5:  zodiacSign = "Ox";
                break;
            case 6:  zodiacSign = "Tiger";
                break;
            case 7:  zodiacSign = "Hare";
                break;
            case 8:  zodiacSign = "Dragon";
                break;
            case 9:  zodiacSign = "Snake";
                break;
            case 10:  zodiacSign = "Horse";
                break;
            case 11:  zodiacSign = "Sheep";
                break;
            default: zodiacSign = "";
                break;
        }

        System.out.println(zodiacSign);
    }
}
