package telerikalpha.workshop.arrays_tasks;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class SymmetricArrays {

    private static void testInput(){
        String input = "4\n" +
                "1 2 3 2 1\n" +
                "2 1\n" +
                "1 2 2 1\n" +
                "4";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }
    public static void main(String[] args) {
        testInput();

        Scanner scanner = new Scanner(System.in);
        String nString = scanner.nextLine();
        int n = Integer.parseInt(nString);

        for (int i = 0; i < n; i++){
            String[] line = scanner.nextLine().split(" ");

        }

    }
}
