package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class RotateList {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String[] input = user_input.nextLine().split(",");
        Integer n = new Integer(user_input.nextLine());
        int rotation_position = 0;

        if (n > input.length) {
            rotation_position = n % input.length;
        } else {
            rotation_position = n;
        }

        //System.out.println(rotation_position);

        String[] rotated_arr = new String[input.length];

/*        for (int i = 0; i < input.length - rotation_position; i++) {
            rotated_arr[i] = input[rotation_position + i];
        }

        for (int j = 0; j < rotation_position; j++) {
            rotated_arr[input.length - rotation_position + j] = input[j];
        }*/

        for (int i = 0; i < input.length; i++) {
            if (i < input.length - rotation_position) {
                rotated_arr[i] = input[rotation_position + i];
            } else {
                for (int j = 0; j < rotation_position; j++) {
                    rotated_arr[input.length - rotation_position + j] = input[j];
                }
            }
        }

        for (int jj = 0; jj < rotated_arr.length; jj++) {
            if (jj < rotated_arr.length - 1) {
                System.out.print(rotated_arr[jj] + ",");
            } else {
                System.out.println(rotated_arr[jj]);
            }
        }
    }
}
