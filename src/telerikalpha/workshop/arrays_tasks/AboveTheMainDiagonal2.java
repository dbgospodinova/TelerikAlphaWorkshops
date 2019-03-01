package telerikalpha.workshop.arrays_tasks;

import java.util.Scanner;

public class AboveTheMainDiagonal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = 0;

        for(int i = 0; i < n; i ++){
            for(int j = i; j < n; j++){
                result = result + (long) Math.pow(2, (j + i));
            }
        }

        System.out.println(result);
    }
}

