package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String[] arrOfStr = user_input.next().split(",");
        Integer[] numbers = new Integer[arrOfStr.length];
        boolean number_present = true;
        //int number = 0;
        String result = "";

        for (int i = 1; i <= arrOfStr.length; i++) {
            for(int j = 0; j < arrOfStr.length; j++){
                numbers[j] = Integer.parseInt(arrOfStr[j]);

                if(numbers[j] == i){
                    number_present = false;
                    break;
                }else{
                    number_present = true;
                }
            }

            if (number_present){
                result = result + i;
                System.out.print(result);
                result = "" + ",";

            }
        }
    }
}
