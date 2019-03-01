package telerikalpha.workshop.training2;

// There are six bitwise Operators: &, |, ^, ~, <<, >>

public class BitwiseOperators {
    public static void main(String args[]) {

        int numberOne = 11;  /* 11 = 00001011 */
        int numberTwo = 22;  /* 22 = 00010110 */
        int result = 0;

        result = numberOne & numberTwo;
        System.out.println("NumberOne & NumberTwo: " + result);

        result = numberOne | numberTwo;
        System.out.println("NumberOne | NumberTwo: " + result);

        result = numberOne ^ numberTwo;
        System.out.println("NumberOne ^ NumberTwo: " + result);

        result = ~numberOne;
        System.out.println("~NumberOne: " + result);

        result = numberOne << 2;
        System.out.println("NumberOne << 2: " + result);

        result = numberOne >> 2;
        System.out.println("NumberOne >> 2: " + result);
    }
}
