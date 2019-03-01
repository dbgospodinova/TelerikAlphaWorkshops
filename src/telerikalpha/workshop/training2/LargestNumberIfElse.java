package telerikalpha.workshop.training2;

public class LargestNumberIfElse {
    public static void main(String[] args) {

        int numberOne = 10, numberTwo = 20, numberThree = 7;

        if(numberOne >= numberTwo && numberOne >= numberThree) {
            System.out.println(numberOne + " is the largest Number");
        }else if (numberTwo >= numberOne && numberTwo >= numberThree) {
            System.out.println(numberTwo + " is the largest Number");
        }else {
            System.out.println(numberThree + " is the largest Number");
        }


        if(numberOne >= numberTwo){
            if (numberOne >= numberThree)
                System.out.println(numberOne + " is the largest Number");
        }
        else {
            if(numberTwo >= numberThree) {
                System.out.println(numberTwo + " is the largest Number");
            }else {
                System.out.println(numberThree + " is the largest Number");
            }
        }
    }
}
