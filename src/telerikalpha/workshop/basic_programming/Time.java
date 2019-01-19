package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String userInputDays = userInput.next();
        int days = Integer.parseInt(userInputDays);

        userInput.nextLine();

        String inputInputHours = userInput.next();
        int hours = Integer.parseInt(inputInputHours);

        userInput.nextLine();

        String inputInputMinutes = userInput.next();
        int minutes = Integer.parseInt(inputInputMinutes);

        userInput.nextLine();

        String inputInputSeconds = userInput.next();
        int seconds = Integer.parseInt(inputInputSeconds);

        int timeInSeconds = days * 86400 + hours * 3600 + minutes * 60 + seconds;

        if (0 <= days & days <= 1000){
            if (0 <= hours & hours <= 1000){
                if (0 <= minutes & minutes <= 1000){
                    if (0 <= seconds & seconds <= 1000){
                        System.out.println(timeInSeconds);
                    }
                }
            }
        }
    }
}
