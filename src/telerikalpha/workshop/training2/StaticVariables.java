package telerikalpha.workshop.training2;

public class StaticVariables {
    //Static variables
    public static String myClassVar = "class or static variable";
    public static String secondCalssVar = "test";

    public static void main(String args[]) {
        StaticVariables obj = new StaticVariables();
        StaticVariables obj2 = new StaticVariables();
        StaticVariables obj3 = new StaticVariables();

        //Print static variable
        System.out.println();
        System.out.println(myClassVar);

        //All three will display "class or static variable"
        System.out.println();
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);

        System.out.println();
        System.out.println(obj.secondCalssVar);
        System.out.println(obj2.secondCalssVar);
        System.out.println(obj3.secondCalssVar);

        //changing the value of static variable using obj2
        obj2.myClassVar = "Changed Text";

        //All three will display "Changed Text"
        System.out.println();
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);

        //Print static variable
        System.out.println();
        System.out.println(myClassVar);
    }
}
