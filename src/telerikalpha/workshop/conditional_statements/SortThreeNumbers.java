package telerikalpha.workshop.conditional_statements;

import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String userInputNumberOne = userInput.next();
        int numberOne = Integer.parseInt(userInputNumberOne);

        userInput.nextLine();

        String userInputNumberTwo = userInput.next();
        int numberTwo = Integer.parseInt(userInputNumberTwo);

        userInput.nextLine();

        String userInputNumberThree = userInput.next();
        int numberThree = Integer.parseInt(userInputNumberThree);

        userInput.nextLine();

        int biggest=0;
        int middle=0;
        int small=0;

        if (numberOne >= numberTwo & numberOne >= numberThree){
            biggest = numberOne;
            if(numberTwo >= numberThree){
                middle = numberTwo;
                small = numberThree;
            }else{
                middle = numberThree;
                small = numberTwo;
            }
        }

        if (numberTwo >= numberOne & numberTwo >= numberThree){
            biggest = numberTwo;
            if(numberThree >= numberOne){
                middle = numberThree;
                small = numberOne;
            }else{
                middle = numberOne;
                small = numberThree;
            }
        }

        if (numberThree >= numberOne & numberThree >= numberTwo){
            biggest = numberThree;
            if(numberTwo >= numberOne){
                middle = numberTwo;
                small = numberOne;
            }else{
                middle = numberOne;
                small = numberTwo;
            }
        }

        if (-1000 <= numberOne & numberOne <= 1000){
            if (-1000 <= numberTwo & numberTwo <= 1000){
                if (-1000 <= numberThree & numberThree <= 1000){
                    System.out.println(biggest + " " + middle + " " + small);
                }
            }
        }

    }
}
