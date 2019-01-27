package telerikalpha.workshop.training;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner useInput = new Scanner(System.in);
        boolean isPossitive = true;
        String result = "";

        for(int i = 0; i < 3; i++){
            double number = Double.parseDouble(useInput.nextLine());
            if (number == 0){
                result = "0";
            }else if(number < 0 && isPossitive){
                isPossitive = false;
            }else if(number < 0){
                isPossitive = true;
            }
        }

        if(result.equals("0")){
            System.out.println(0);
        }else{
            if(isPossitive){
                System.out.println("+");
            }else{
                System.out.println("-");
            }
        }
    }
}
