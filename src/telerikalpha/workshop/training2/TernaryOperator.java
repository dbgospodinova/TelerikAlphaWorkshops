package telerikalpha.workshop.training2;

public class TernaryOperator {
    public static void main(String args[]) {
        int numberOne, numberTwo;
        numberOne = 25;
        /* numberOne is not equal to 10 that's why
         * the second value after colon is assigned
         * to the variable numberTwo
         */
        numberTwo = (numberOne == 10) ? 100 : 200;
        System.out.println("numberTwo: " + numberTwo);

        /* numberOne is equal to 25 that's why
         * the first value is assigned
         * to the variable numberTwo
         */
        numberTwo = (numberOne == 25) ? 100 : 200;
        System.out.println("numberTwo: " + numberTwo);
    }
}