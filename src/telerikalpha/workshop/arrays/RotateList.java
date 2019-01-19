package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class RotateList {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] input = userInput.nextLine().split(",");
        Integer n = new Integer(userInput.nextLine());
        int rotationPosition = 0;

        if (n > input.length) {
            rotationPosition = n % input.length;
        } else {
            rotationPosition = n;
        }

        //System.out.println(rotationPosition);

        String[] rotatedArr = new String[input.length];

/*        for (int i = 0; i < input.length - rotationPosition; i++) {
            rotatedArr[i] = input[rotationPosition + i];
        }

        for (int j = 0; j < rotationPosition; j++) {
            rotatedArr[input.length - rotationPosition + j] = input[j];
        }*/

        for (int i = 0; i < input.length; i++) {
            if (i < input.length - rotationPosition) {
                rotatedArr[i] = input[rotationPosition + i];
            } else {
                for (int j = 0; j < rotationPosition; j++) {
                    rotatedArr[input.length - rotationPosition + j] = input[j];
                }
            }
        }

        for (int jj = 0; jj < rotatedArr.length; jj++) {
            if (jj < rotatedArr.length - 1) {
                System.out.print(rotatedArr[jj] + ",");
            } else {
                System.out.println(rotatedArr[jj]);
            }
        }
    }
}
