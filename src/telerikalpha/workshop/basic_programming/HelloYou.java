package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class HelloYou {

    public static void main(String[] args) {
        Scanner user_input = new Scanner( System.in );

        String person_name;
        //System.out.print("Please enter your name: ");
        person_name = user_input.nextLine();

        /*String family_name;
        System.out.print("Enter your family name: ");
        family_name = user_input.next( );

        String full_name;
        full_name = first_name + " " + family_name;*/

        System.out.println("Hello, " + person_name +"!");


    }
}
