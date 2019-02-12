package telerikalpha.workshop.entrance.exam;

import java.util.Scanner;

public class LongestBlockInString {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();

        int count = 0;
        int startIndex = 0;
        int endIndex = 0;
        int largestBlock = 0;
        int lbStartIndex = 0;
        int lbEndndex = 0;

        for(int i = 0; i < input.length() - 1; i++){

            if(input.charAt(i) == input.charAt(i + 1)){
                count++;
                endIndex = i + 1;
            }else{
                count = 0;
                startIndex = i + 1;
            }

            if(count > largestBlock){
                largestBlock = count;
                lbStartIndex = startIndex;
                lbEndndex = endIndex;
            }
        }

        //System.out.println(lbStartIndex);
        //System.out.println(lbEndndex);
        System.out.println(input.substring(lbStartIndex, lbEndndex + 1));
    }
}
