package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String user_input_miles = user_input.next();

        int miles = Integer.parseInt(user_input_miles);
        double consumption = 4.54 / (miles*1.6) * 100 ;
        int litres = (int)consumption;

        if (1 <= miles & miles <= 100){
            System.out.println(litres + " litres per 100 km");
        }
    }
}
