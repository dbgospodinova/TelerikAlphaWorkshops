package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String[] arrOfStr = userInput.next().split(",");
        String result = "";

        int zeros = 0;

        for(int i = 0; i < arrOfStr.length; i++){
            Integer number = Integer.parseInt(arrOfStr[i]);
            if(number == 0){
                zeros++;
            }
            else{
                result = result + number;
                System.out.print(result);
                result = "" + ",";
            }
        }

        for(int j = 0; j < zeros; j++){
            System.out.print(",0");
        }
    }
}
