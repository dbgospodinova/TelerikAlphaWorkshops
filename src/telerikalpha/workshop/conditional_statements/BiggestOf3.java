package telerikalpha.workshop.conditional_statements;

import java.util.Scanner;

public class BiggestOf3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Float arrayOfNumbers[] = new Float[3];
        String userInputNumberOne = userInput.next();
        float numberOne = Float.valueOf(userInputNumberOne);
        arrayOfNumbers[0] = numberOne;

        userInput.nextLine();

        String userInputNumberTwo = userInput.next();
        float numberTwo = Float.valueOf(userInputNumberTwo);
        arrayOfNumbers[1] = numberTwo;

        userInput.nextLine();

        String userInputNumberThree = userInput.next();
        float numberThree = Float.valueOf(userInputNumberThree);
        arrayOfNumbers[2] = numberThree;

        float biggestNumber = -200;

        for(int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] >= biggestNumber) {
                biggestNumber = arrayOfNumbers[i];
            }
        }

        if (-200 <= numberOne & numberOne <= 200){
            if (-200 <= numberTwo & numberTwo <= 200){
                if (-200 <= numberThree & numberThree <= 200){
                    if (biggestNumber % 1.0 != 0) {
                        System.out.printf("%s", biggestNumber);
                    }else {
                        System.out.printf("%.0f", biggestNumber);
                    }
                }
            }
        }
    }
}
