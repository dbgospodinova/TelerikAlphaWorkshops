package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class IsaListSorted {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        Integer count_of_arrays = Integer.parseInt(user_input.nextLine());
        boolean is_sorted = false;
        Boolean[] result = new Boolean[count_of_arrays];

        for(int i = 0; i < count_of_arrays; i++){
            String[] input = user_input.nextLine().split(",");
            Integer[] array = new Integer[input.length];
            for (int j = 0; j < input.length - 1; j++){
                array[j] = Integer.parseInt(input[j]);
                array[j + 1] = Integer.parseInt(input[j + 1]);

                if (array[j + 1] >= array [j]){
                    is_sorted = true;
                }else{
                    is_sorted = false;
                    break;
                }
            }
            result[i] = is_sorted;
        }

        for(int ii = 0; ii < count_of_arrays; ii++){
            System.out.println(result[ii]);
        }
    }
}
