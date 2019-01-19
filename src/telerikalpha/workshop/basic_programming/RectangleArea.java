package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String input_width = userInput.next();
        int width = Integer.parseInt(input_width);

        userInput.nextLine();
        String input_height = userInput.next();
        int height = Integer.parseInt(input_height);

        int rectangleArea = width * height;

        System.out.println(rectangleArea);
    }

}
