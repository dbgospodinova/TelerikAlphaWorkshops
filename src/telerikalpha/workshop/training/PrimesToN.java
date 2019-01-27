package telerikalpha.workshop.training;

import java.util.Scanner;

public class PrimesToN {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Integer number = userInput.nextInt();
        boolean[] allNumbers = new boolean[number + 1];
        String result = "";

        for (int i = 0; i < allNumbers.length; i++){
            allNumbers[i] = true;
        }

        int maxNumbers = (int)Math.sqrt(allNumbers.length);

        for(int j = 2; j <= maxNumbers; j++){
            if(allNumbers[j]){
                for(int ii = j * j; ii < allNumbers.length; ii += j){
                    allNumbers[ii] = false;
                }
            }
        }

        for(int jj = 1; jj < allNumbers.length; jj++){
            if(allNumbers[jj]) {
                result = result + jj + " ";
            }
        }

        System.out.println(result.substring(0, result.length() - 1));
    }
}

