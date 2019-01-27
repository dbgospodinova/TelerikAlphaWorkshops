package telerikalpha.workshop.training;

import java.util.Scanner;

public class Kolbi {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] input = userInput.nextLine().split(" ");
        int kolbi = Integer.parseInt(input[0]);
        double volume = Double.parseDouble(input[1]);
        long totalVolume = 1;
        int kolba = 0;

        if (volume > 0) {
            for (int i = 3; i <= kolbi; i++) {
                totalVolume = totalVolume + i - 1;
                if (volume <= totalVolume) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                        break;
                    } else {
                        System.out.println(i + 1);
                        break;
                    }
                }
            }
        }else{
            System.out.println(1);
        }

    }
}
