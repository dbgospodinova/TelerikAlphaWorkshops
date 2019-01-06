package telerikalpha.workshop.conditional_statements;

import java.util.Scanner;

public class CalculateChange {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        double price = Double.parseDouble(user_input.nextLine());
        double paid = Double.parseDouble(user_input.nextLine());

        int change = (int)((paid - price)*100);
        int temp;

        int lev = change / 100;
        if(lev != 0){
            System.out.println(lev + " x 1 lev");
        }
        temp = change % 100;

        int stotinki_50 = temp / 50;
        if(stotinki_50 != 0){
            System.out.println(stotinki_50 + " x 50 stotinki");
        }
        temp = temp % 50;

        int stotinki_20 = temp / 20;
        if(stotinki_20 != 0){
            System.out.println(stotinki_20 + " x 20 stotinki");
        }
        temp = temp % 20;

        int stotinki_10 = temp / 10;
        if(stotinki_10 != 0){
            System.out.println(stotinki_10 + " x 10 stotinki");
        }
        temp = temp % 10;

        int stotinki_5 = temp / 5;
        if(stotinki_5 != 0){
            System.out.println(stotinki_5 + " x 5 stotinki");
        }
        temp = temp % 5;

        int stotinki_2 = temp / 2;
        if(stotinki_2 != 0){
            System.out.println(stotinki_2 + " x 2 stotinki");
        }
        temp = temp % 2;

        if(temp != 0){
            System.out.println(temp + " x 1 stotinka");
        }
    }
}
