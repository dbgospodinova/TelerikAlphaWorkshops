package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String userInputMiles = userInput.next();

        int miles = Integer.parseInt(userInputMiles);
        double consumption = 4.54 / (miles*1.6) * 100 ;
        int litres = (int)consumption;

        if (1 <= miles & miles <= 100){
            System.out.println(litres + " litres per 100 km");
        }
    }
}
