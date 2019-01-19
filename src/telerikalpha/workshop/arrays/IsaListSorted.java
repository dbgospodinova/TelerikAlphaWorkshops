package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class IsaListSorted {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Integer countOfArrays = Integer.parseInt(userInput.nextLine());
        boolean isSorted = false;
        Boolean[] result = new Boolean[countOfArrays];

        for(int i = 0; i < countOfArrays; i++){
            String[] input = userInput.nextLine().split(",");
            Integer[] array = new Integer[input.length];
            for (int j = 0; j < input.length - 1; j++){
                array[j] = Integer.parseInt(input[j]);
                array[j + 1] = Integer.parseInt(input[j + 1]);

                if (array[j + 1] >= array [j]){
                    isSorted = true;
                }else{
                    isSorted = false;
                    break;
                }
            }
            result[i] = isSorted;
        }

        for(int ii = 0; ii < countOfArrays; ii++){
            System.out.println(result[ii]);
        }
    }
}
