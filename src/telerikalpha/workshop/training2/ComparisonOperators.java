package telerikalpha.workshop.training2;

public class ComparisonOperators {

    public static void main(String args[]) {
        int numberOne = 10;
        int numberTwo = 50;
        if (numberOne == numberTwo) {
            System.out.println("NumberOne and NumberTwo are equal");
        } else {
            System.out.println("NumberOne and NumberTwo are not equal");
        }

        if (numberOne != numberTwo) {
            System.out.println("NumberOne and NumberTwo are not equal");
        } else {
            System.out.println("NumberOne and NumberTwo are equal");
        }

        if (numberOne > numberTwo) {
            System.out.println("NumberOne is greater than NumberTwo");
        } else {
            System.out.println("NumberOne is not greater than NumberTwo");
        }

        if (numberOne >= numberTwo) {
            System.out.println("NumberOne is greater than or equal to NumberTwo");
        } else {
            System.out.println("NumberOne is less than NumberTwo");
        }

        if (numberOne < numberTwo) {
            System.out.println("NumberOne is less than NumberTwo");
        } else {
            System.out.println("NumberOne is not less than NumberTwo");
        }

        if (numberOne <= numberTwo) {
            System.out.println("NumberOne is less than or equal to NumberTwo");
        } else {
            System.out.println("NumberOne is greater than NumberTwo");
        }
    }
}
