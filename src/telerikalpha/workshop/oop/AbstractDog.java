package telerikalpha.workshop.oop;

//abstract class
abstract class AbstractAnimal{
    //abstract method
    public abstract void animalSound();
}
public class AbstractDog extends AbstractAnimal{

    public void animalSound(){
        System.out.println("Woof");
    }
    public static void main(String args[]){
        AbstractAnimal obj = new AbstractDog();
        obj.animalSound();
    }
}