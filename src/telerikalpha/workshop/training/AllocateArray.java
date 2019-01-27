package telerikalpha.workshop.training;

import java.util.Scanner;

public class AllocateArray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int arrayLength = userInput.nextInt();

        if (arrayLength >= 1 && arrayLength <= 20){
            for(int i = 0; i < arrayLength; i++){
                System.out.println(i * 5);
            }
        }
    }
}
