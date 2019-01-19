package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class CombineLists {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] firstArray = userInput.nextLine().split(",");
        String[] secondArray = userInput.nextLine().split(",");


        for (int i = 0; i < firstArray.length; i ++){
            if (i < firstArray.length - 1){
                System.out.print(firstArray[i] + ",");
                System.out.print(secondArray[i] + ",");
            }else{
                System.out.print(firstArray[i] + ",");
                System.out.print(secondArray[i]);
            }
        }
    }
}
