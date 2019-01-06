package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class IsaListSorted {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        Integer count_of_arrays = Integer.parseInt(user_input.nextLine());
        String[] arrOfArr = new String[count_of_arrays];
        String[] arrOfStr;
        boolean temp = true;

        Boolean[] results = new Boolean[count_of_arrays];

        if (count_of_arrays > 0 & count_of_arrays <= 10) {
            for (int i = 0; i < count_of_arrays; i++) {
                arrOfArr[i] = user_input.nextLine();
            }
        }

        for (int j = 0; j < count_of_arrays; j++) {
            arrOfStr = arrOfArr[j].split(",");
            if (arrOfStr.length >= 1 & arrOfStr.length <= 20) {
                Integer[] numbers = new Integer[arrOfStr.length];
                for (int k = 0; k < numbers.length - 1; k++) {
                    numbers[k] = Integer.parseInt(arrOfStr[k]);
                    numbers[k + 1] = Integer.parseInt(arrOfStr[k + 1]);

                    if (numbers[k] <= numbers[k + 1] & temp) {
                        results[j] = true;
                    } else {
                        results[j] = false;
                        temp = false;
                    }
                }

                if (j < count_of_arrays - 1) {
                    System.out.println(results[j]);
                } else {
                    System.out.println(results[j]);
                }

            }

        }
    }
}
