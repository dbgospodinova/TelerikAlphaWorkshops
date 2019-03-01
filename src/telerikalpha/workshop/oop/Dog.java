package telerikalpha.workshop.oop;

//Dynamic Polymorphism
class Animal {
    public void animalSound() {
        System.out.println("Default Sound");
    }
}

public class Dog extends Animal {

    public void animalSound() {
        System.out.println("Woof");
    }

    public static void main(String args[]) {
        Animal obj = new Dog();
        obj.animalSound();

        Animal obj2 = new Animal();
        obj2.animalSound();
// This would call the Animal class method

        Dog obj3 = new Dog();
        obj3.animalSound();
// This would call the Dog class method

        Animal obj4 = new Dog();
        obj4.animalSound();
// This would call the Dog class method
    }
}