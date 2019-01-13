package telerikalpha.workshop.mock_exam_2;

import java.util.Scanner;

public class Speeds {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        Integer cars = Integer.parseInt(user_input.nextLine());
        Integer[] speeds = new Integer[cars];

        for (int j = 0; j < cars; j++) {
            speeds[j] = Integer.parseInt(user_input.nextLine());
        }

        int count = 1;
        int group_members = 0;
        int sum = speeds[0];
        int max_sum = 0;
        int min_speed = speeds[0];

        for (int i = 1; i < speeds.length; i++) {
            if (speeds[i] > min_speed) {
                sum = sum + speeds[i];
                count++;
                if (count >= group_members) {
                    if (count > group_members) {
                        max_sum = sum;
                    } else if (sum > max_sum) {
                        max_sum = sum;
                    }
                }
            } else {
                min_speed = speeds[i];
                if (count >= group_members) {
                    if (sum >= max_sum) {
                        max_sum = sum;
                    }
                }
                group_members = count;
                count = 1;
                sum = speeds[i];
            }
        }
        System.out.println(max_sum);
    }
}
