package telerikalpha.workshop.conditional_statements;

import java.util.Scanner;

public class BiggestOf3 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        Float arrayOfNumbers[] = new Float[3];
        float temp = 0;
        String user_input_numberOne = user_input.next();
        float numberOne = Float.valueOf(user_input_numberOne);
        arrayOfNumbers[0] = numberOne;

        user_input.nextLine();

        String user_input_numberTwo = user_input.next();
        float numberTwo = Float.valueOf(user_input_numberTwo);
        arrayOfNumbers[1] = numberTwo;

        user_input.nextLine();

        String user_input_numberThree = user_input.next();
        float numberThree = Float.valueOf(user_input_numberThree);
        arrayOfNumbers[2] = numberThree;

        float biggest_number=-200;

        for(int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] >= biggest_number) {
                biggest_number = arrayOfNumbers[i];
            }
        }

        if (-200 <= numberOne & numberOne <= 200){
            if (-200 <= numberTwo & numberTwo <= 200){
                if (-200 <= numberThree & numberThree <= 200){
                    if (biggest_number % 1.0 != 0) {
                        System.out.printf("%s", biggest_number);
                    }else {
                        System.out.printf("%.0f", biggest_number);
                    }
                }
            }
        }
    }
}
