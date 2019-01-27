package telerikalpha.workshop.training;

import java.util.Scanner;

public class GuessTheDate {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int year = userInput.nextInt();
        int month = userInput.nextInt();
        int day = userInput.nextInt() - 1;

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Integer[] days =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String monthName = "";

        if(day > 0) {
            monthName = months[month - 1];
        }else{
            if(month > 1) {
                monthName = months[month - 2];
                day = days[month - 2];
                if(year % 4 == 0 && day == 28){
                    day = day + 1;
                }
            }else{
                monthName = months[11];
                day = days[11];
                year = year - 1;
            }
        }

        System.out.println(day + "-" + monthName + "-" + year);
    }
}
