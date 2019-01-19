package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class HelloYou {

    public static void main(String[] args) {
        Scanner userInput = new Scanner( System.in );

        String personName;
        //System.out.print("Please enter your name: ");
        personName = userInput.nextLine();

        /*String family_name;
        System.out.print("Enter your family name: ");
        family_name = userInput.next( );

        String full_name;
        full_name = first_name + " " + family_name;*/

        System.out.println("Hello, " + personName +"!");


    }
}
