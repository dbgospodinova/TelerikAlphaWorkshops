package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String user_input_days = user_input.next();
        int days = Integer.parseInt(user_input_days);

        user_input.nextLine();

        String input_input_hours = user_input.next();
        int hours = Integer.parseInt(input_input_hours);

        user_input.nextLine();

        String input_input_minutes = user_input.next();
        int minutes = Integer.parseInt(input_input_minutes);

        user_input.nextLine();

        String input_input_seconds = user_input.next();
        int seconds = Integer.parseInt(input_input_seconds);

        int time_in_seconds = days * 86400 + hours * 3600 + minutes * 60 + seconds;

        if (0 <= days & days <= 1000){
            if (0 <= hours & hours <= 1000){
                if (0 <= minutes & minutes <= 1000){
                    if (0 <= seconds & seconds <= 1000){
                        System.out.println(time_in_seconds);
                    }
                }
            }
        }
    }
}
