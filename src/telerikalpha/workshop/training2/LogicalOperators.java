package telerikalpha.workshop.training2;

public class LogicalOperators {
    public static void main(String args[]) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("true && false: " + (b1&&b2));
        System.out.println("true || false: " + (b1||b2));
        System.out.println("!(true && false): " + !(b1&&b2));
    }
}
