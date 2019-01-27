package telerikalpha.workshop.SolveProblems;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int m = userInput.nextInt();
        int[][] array = new int[n][m];
        int step = 1;
        int index = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = index + (step * j);

            }
            step = 3;
            index = index + step;
        }

        long sum = 0;
        for (int ii = 0; ii < n; ii++) {
            for (int jj = 0; jj < m; jj++) {
                System.out.print(array[ii][jj] + " ");
               /* if (ii == 0 && jj % 2 == 0) {
                    sum = sum + array[ii][jj];
                    sum = sum + array[ii + n - 1][jj];
                } else {
                    if ((ii % 2 == 1)) {
                        if ((jj % 2 == 1) && (jj != m - 1)) {
                            sum = sum + array[ii][jj] * 2;
                        } else if ((jj % 2 == 1)) {
                            sum = sum + array[ii][jj];
                        }
                    }

                    if ((ii % 2 == 0)) {
                        if ((jj % 2 == 0) && (jj == 0)) {
                            sum = sum + array[ii][jj];
                        } else if ((jj % 2 == 0)) {
                            sum = sum + array[ii][jj] * 2;
                        }
                    }
                }*/

            }
            System.out.println();
        }
        System.out.println(sum);
    }
}