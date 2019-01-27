package telerikalpha.workshop.training;

import java.util.Scanner;

public class OnTheBeach {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] input = userInput.nextLine().split(" ");
        String time1 = "";
        String time2 = "";
        boolean meeting = false;
        String[] time = new String[4];

        time1 = input[0] + input[1];
        time2 = input[4] + input[5];
        if (Integer.parseInt(time1) >= Integer.parseInt(time2)) {
            time[0] = input[0];
            time[1] = input[1];
        } else {
            time[0] = input[4];
            time[1] = input[5];
        }

        time1 = input[2] + input[3];
        time2 = input[6] + input[7];
        if (Integer.parseInt(time1) >= Integer.parseInt(time2)) {
            time[2] = input[6];
            time[3] = input[7];
        } else {
            time[2] = input[2];
            time[3] = input[3];
        }

        time1 = time[0] + time[1];
        time2 = time[2] + time[3];
        if (Integer.parseInt(time1) <= Integer.parseInt(time2)) {
            System.out.println(String.join(" ", time));
        } else {
            System.out.println("No");
        }
    }
}
