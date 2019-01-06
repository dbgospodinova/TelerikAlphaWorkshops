package telerikalpha.workshop.conditional_statements;

import java.util.Scanner;

public class DogYears {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String user_input_hy = user_input.next();

        int human_years = Integer.parseInt(user_input_hy);

        int dog_years = 0;

        if(1 <= human_years & human_years <= 15){
            for (int i = 0; i < human_years; i++) {
                if (i < 2) {
                    dog_years = dog_years + 10;
                } else {
                    dog_years = dog_years + 4;
                }
            }
            System.out.println(dog_years);
        }
    }
}
