package telerikalpha.workshop.arrays;

import java.util.Scanner;

public class CombineLists {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String[] first_array = user_input.nextLine().split(",");
        String[] second_array = user_input.nextLine().split(",");


        for (int i = 0; i < first_array.length; i ++){
            if (i < first_array.length - 1){
                System.out.print(first_array[i] + ",");
                System.out.print(second_array[i] + ",");
            }else{
                System.out.print(first_array[i] + ",");
                System.out.print(second_array[i]);
            }
        }
    }
}
