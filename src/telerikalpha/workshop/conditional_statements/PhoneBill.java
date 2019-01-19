package telerikalpha.workshop.conditional_statements;

import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Integer messages = Integer.parseInt(userInput.nextLine());
        Integer minutes = Integer.parseInt(userInput.nextLine());

        int additional;
        double amount;
        double taxes = 0;

        if(messages > 20){
            additional = messages - 20;
            amount = additional * 0.06;
            taxes = amount;
            System.out.printf("%d additional messages for %.2f levas\n", additional,amount);
        }else{
            System.out.println("0 additional messages for 0.00 levas");
        }

        if(minutes > 60){
            additional = minutes - 60;
            amount = additional * 0.1;
            taxes = taxes + amount;
            System.out.printf("%d additional minutes for %.2f levas\n", additional,amount);
        }else{
            System.out.println("0 additional minutes for 0.00 levas");
        }

        System.out.printf("%.2f additional taxes\n", (taxes * 0.2));
        System.out.printf("%.2f total bill", (taxes * 1.2 + 12));
    }
}
