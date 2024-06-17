// creating abstract method.

// Abstract class
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

public class _02_Abstract_Method {
    public static void main(String[] args) {
        // create obj of Dog class
        Dog d1 = new Dog();

        d1.makeSound();
        d1.eat();
    }
}
