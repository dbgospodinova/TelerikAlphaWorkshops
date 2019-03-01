package telerikalpha.workshop.training2;

public class InstanceVariables {
    String myInstanceVar="instance variable";

    public static void main(String args[]){
        InstanceVariables obj = new InstanceVariables();
        InstanceVariables obj2 = new InstanceVariables();
        InstanceVariables obj3 = new InstanceVariables();

        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);


        obj2.myInstanceVar = "Changed Text";


        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);

        System.out.println();
    }
}
