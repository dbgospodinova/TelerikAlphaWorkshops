package telerikalpha.workshop.conditional_statements;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        Integer year = Integer.parseInt(user_input.next());

        int zodiac = year % 12;
        String zodiac_sign;


        switch (zodiac) {
            case 0: zodiac_sign = "Monkey";
                break;
            case 1: zodiac_sign = "Rooster";
                break;
            case 2:  zodiac_sign = "Dog";
                break;
            case 3:  zodiac_sign = "Pig";
                break;
            case 4:  zodiac_sign = "Rat";
                break;
            case 5:  zodiac_sign = "Ox";
                break;
            case 6:  zodiac_sign = "Tiger";
                break;
            case 7:  zodiac_sign = "Hare";
                break;
            case 8:  zodiac_sign = "Dragon";
                break;
            case 9:  zodiac_sign = "Snake";
                break;
            case 10:  zodiac_sign = "Horse";
                break;
            case 11:  zodiac_sign = "Sheep";
                break;
            default: zodiac_sign = "";
                break;
        }

        System.out.println(zodiac_sign);
    }
}
