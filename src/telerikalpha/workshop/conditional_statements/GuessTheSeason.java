package telerikalpha.workshop.conditional_statements;

import java.util.Scanner;

public class GuessTheSeason {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String month = user_input.nextLine();
        Integer day = Integer.parseInt(user_input.next());

        String season;

        switch (month) {
            case "January": season = "Winter";
                break;
            case "February": season = "Winter";
                break;
            case "March":  season = "Winter";
                break;
            case "April":  season = "Spring";
                break;
            case "May":  season = "Spring";
                break;
            case "June":  season = "Spring";
                break;
            case "July":  season = "Summer";
                break;
            case "August":  season = "Summer";
                break;
            case "September":  season = "Summer";
                break;
            case "October":  season = "Autumn";
                break;
            case "November":  season = "Autumn";
                break;
            default: season = "Autumn";
                break;
        }

        if (month.equals("March")& day >= 20){
            season = "Spring";
        }

        if (month.equals("June")& day >= 21){
            season = "Summer";
        }

        if (month.equals("September")& day >= 22){
            season = "Autumn";
        }

        if (month.equals("December ")& day >= 21){
            season = "Winter";
        }

        System.out.println(season);
    }
}
