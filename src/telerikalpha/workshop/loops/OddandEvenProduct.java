package telerikalpha.workshop.loops;

import java.util.Scanner;

public class OddandEvenProduct {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        Integer n = Integer.parseInt(user_input.nextLine());

        Integer odd_product_value = 1;
        Integer even_product_value = 1;

        for(int i = 1; i <= n; i++){
            Integer number = Integer.parseInt(user_input.nextLine());
            if(i % 2 != 0){
                odd_product_value = odd_product_value * number;

            }else{
                even_product_value = even_product_value * number;
            }
        }

        if(odd_product_value == even_product_value){
            System.out.println("yes " + odd_product_value);
        }else{
            System.out.println("no " + odd_product_value + " " + even_product_value );
        }
    }
}
