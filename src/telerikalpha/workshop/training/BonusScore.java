package telerikalpha.workshop.training;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();

        if(input > 0 && input < 4){
            System.out.println(input * 10);
        }else if(input > 3 && input < 7){
            System.out.println(input * 100);
        }else if(input > 6 && input < 10){
            System.out.println(input * 1000);
        }else{
            System.out.println("invalid score");
        }
    }
}
