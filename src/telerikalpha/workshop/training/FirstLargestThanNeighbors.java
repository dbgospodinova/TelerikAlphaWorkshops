package telerikalpha.workshop.training;

import java.util.Scanner;

public class FirstLargestThanNeighbors {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int arraySize = Integer.parseInt(userInput.nextLine());
        String[] input = userInput.nextLine().split(" ");

        int index = 0;
        boolean exist = false;

        for(int i = 1; i < arraySize - 1; i++) {
            if (Integer.parseInt(input[i]) > Integer.parseInt(input[i - 1])){
                if (Integer.parseInt(input[i]) > Integer.parseInt(input[i + 1])){
                    exist = true;
                    index = i;
                    break;
                }
            }
        }

        if(exist){
            System.out.println(index);
        }else{
            System.out.println(-1);
        }
    }
}
