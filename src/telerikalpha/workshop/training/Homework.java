package telerikalpha.workshop.training;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner userInpit = new Scanner(System.in);
        int numberN = userInpit.nextInt();
        int counter = 1;
        int isPrime = 2;
        int result = 0;

        if (numberN > 1) {
            for (int j = 2; j <= Math.sqrt(numberN); j++) {

                if (numberN % j == 0) {
                    counter = j;
                    break;
                }else{
                    isPrime++;
                }
            }

            if(isPrime > Math.sqrt(numberN)){
                result = numberN - 1;
            }else{
                result = numberN - (numberN / counter);
            }
        }

        System.out.println(result);
    }
}
