package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner userInpit = new Scanner(System.in);

        String input = userInpit.next();
        double deposit=Double.parseDouble(input);

        for (int i=0; i<3; i++){
            deposit=deposit*1.05;
            System.out.printf("%.2f",deposit);
            System.out.println();
        }
    }
}
