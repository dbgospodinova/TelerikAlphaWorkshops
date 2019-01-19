package telerikalpha.workshop.loops;

import java.util.Scanner;

public class OddandEvenProduct {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Integer n = Integer.parseInt(userInput.nextLine());

        Integer oddProductValue = 1;
        Integer evenProductValue = 1;

        for(int i = 1; i <= n; i++){
            Integer number = Integer.parseInt(userInput.nextLine());
            if(i % 2 != 0){
                oddProductValue = oddProductValue * number;

            }else{
                evenProductValue = evenProductValue * number;
            }
        }

        if(oddProductValue == evenProductValue){
            System.out.println("yes " + oddProductValue);
        }else{
            System.out.println("no " + oddProductValue + " " + evenProductValue );
        }
    }
}
