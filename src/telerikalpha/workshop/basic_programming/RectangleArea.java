package telerikalpha.workshop.basic_programming;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        String input_width = user_input.next();
        int width = Integer.parseInt(input_width);

        user_input.nextLine();
        String input_height = user_input.next();
        int height = Integer.parseInt(input_height);

        int rectangle_area = width * height;

        System.out.println(rectangle_area);
    }

}
