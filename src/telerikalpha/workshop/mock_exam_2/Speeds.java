package telerikalpha.workshop.mock_exam_2;

import java.util.Scanner;

public class Speeds {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int cars = Integer.parseInt(userInput.nextLine());
        Integer[] speeds = new Integer[cars];

        for (int j = 0; j < cars; j++) {
            speeds[j] = Integer.parseInt(userInput.nextLine());
        }

        int count = 1;
        int groupMembers = 0;
        int sum = speeds[0];
        int maxSum = speeds[0];
        int minSpeed = speeds[0];

        for (int i = 1; i < speeds.length; i++) {
            if (speeds[i] > minSpeed) {
                sum = sum + speeds[i];
                count++;
                if (count >= groupMembers) {
                    if (count > groupMembers) {
                        maxSum = sum;
                    } else if (sum >= maxSum) {
                        maxSum = sum;
                    }
                }

            } else {
                minSpeed = speeds[i];
                if (count >= groupMembers) {
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                    groupMembers = count;
                }
                count = 1;
                sum = speeds[i];
            }
        }
        System.out.println(maxSum);
    }
}
