class Animal{
    // Parent class
    
    // field and methods of parent class
    String name;

    public void eat(){
        System.out.println("I can eat ");
    }
}

// inherit method in subclass
class Dog extends Animal{

    // new method in subclass
    public void display(){
        System.out.println("My Name is " + name); //inheriting name form Animal
    }
}

public class _01_Animal {
    public static void main(String[] args) {

        // create an object of Subclass
        Dog labradog = new Dog();

        // access field of super class
        labradog.name = "Rohu";
        labradog.display(); //calling method of subclass

        // call method of superclass using same object
        labradog.eat();

    }
}
