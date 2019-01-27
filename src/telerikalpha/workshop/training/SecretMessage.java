package telerikalpha.workshop.training;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();

        ArrayList<String> letters = new ArrayList<>();
        Pattern p = Pattern.compile("[A-Za-z]");
        Matcher m = p.matcher(input);
        while (m.find()) {
            letters.add(m.group());
        }

        for(int i = letters.size() - 1; i >= 0; i--){
            System.out.print(letters.get(i));
        }
    }
}
