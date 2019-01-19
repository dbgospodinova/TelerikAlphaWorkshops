package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String[] arrOfStr = userInput.next().split(",");
        Integer[] numbers = new Integer[arrOfStr.length];
        boolean numberPresent = true;
        //int number = 0;
        String result = "";

        for (int i = 1; i <= arrOfStr.length; i++) {
            for(int j = 0; j < arrOfStr.length; j++){
                numbers[j] = Integer.parseInt(arrOfStr[j]);

                if(numbers[j] == i){
                    numberPresent = false;
                    break;
                }else{
                    numberPresent = true;
                }
            }

            if (numberPresent){
                result = result + i;
                System.out.print(result);
                result = "" + ",";

            }
        }
    }
}
