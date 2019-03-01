package telerikalpha.workshop.training2;

public class IfStatements {
    public static void main(String args[]){
        int number = 70;
        if( number  < 100 ){
            /* This println statement will only execute,
             * if the above condition is true
             */
            System.out.println("The number is less than 100");
        }

        if( number < 100 ){
            System.out.println("The number is less than 100");
            if(number > 50){
                System.out.println("The number is greater than 50");
            }
        }

        if( number < 50 ){
            System.out.println("The number  is less than 50");
        }
        else {
            System.out.println("The number is greater than or equal 50");
        }

        int numberTwo = 1234;
        if(numberTwo < 100 && numberTwo >= 1) {
            System.out.println("Its a two digit number");
        }
        else if(numberTwo < 1000 && numberTwo >= 100) {
            System.out.println("Its a three digit number");
        }
        else if(numberTwo < 10000 && numberTwo >= 1000) {
            System.out.println("Its a four digit number");
        }
        else if(numberTwo <100000 && numberTwo>= 10000) {
            System.out.println("It's a five digit number");
        }
        else {
            System.out.println("number is not between 1 & 99999");
        }
    }
}
