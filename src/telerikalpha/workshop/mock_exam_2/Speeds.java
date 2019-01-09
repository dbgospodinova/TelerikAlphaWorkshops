package telerikalpha.workshop.mock_exam_2;

import java.util.Scanner;

public class Speeds {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        Integer cars = Integer.parseInt(user_input.nextLine());
        int sum = 0;
        boolean new_group = true;
        int car_speed = 0;
        int car_speed_previous_car = 0;
        int max_sum = 0;

        for (int i = 0; i < cars; i++) {
            car_speed = Integer.parseInt(user_input.nextLine());
            if (car_speed > car_speed_previous_car & new_group) {
                car_speed_previous_car = car_speed;
                sum = sum + car_speed;
                if (sum > max_sum) {
                    max_sum = sum;
                }
            } else {
                sum = 0;
                new_group = false;

            }
        }

        System.out.println(max_sum);
    }
}
