// creating abstract method.

// Abstract class

// import Inheritance.Animal;
// import Inheritance.Dog;

abstract class Animal{
    // Abstract method
    abstract void makeSound();

    // normal method
    public void eat(){
        System.out.println("I can Eat");
    }
}

// Crate a normal class not abstract
class Dog extends Animal {
    // provide implementation for abstract class
    public void makeSound(){
        System.out.println("Bark Bark...");
    }
}
// Extends multiple class 
class Cow extends Animal{
    public void makeSound(){
        System.out.println("It is Cow");
    }
}

public class _02_Abstract_Method {
    public static void main(String[] args) {
        // create obj of Dog class
        Dog d1 = new Dog();

        d1.makeSound();
        d1.eat();

        Cow c1 = new Cow();
        c1.makeSound();
    }
}
