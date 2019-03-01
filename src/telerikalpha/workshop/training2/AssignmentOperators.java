package telerikalpha.workshop.training2;

public class AssignmentOperators {
    public static void main(String args[]) {
        int numberOne = 10;
        int numberTwo;

        numberTwo = numberOne;
        System.out.println("= Output: " + numberTwo);

        numberTwo += numberOne;
        System.out.println("+= Output: " + numberTwo);

        numberTwo -= numberOne;
        System.out.println("-= Output: " + numberTwo);

        numberTwo *= numberOne;
        System.out.println("*= Output: " + numberTwo);

        numberTwo /= numberOne;
        System.out.println("/= Output: " + numberTwo);

        numberTwo %= numberOne;
        System.out.println("%= Output: " + numberTwo);
    }
}