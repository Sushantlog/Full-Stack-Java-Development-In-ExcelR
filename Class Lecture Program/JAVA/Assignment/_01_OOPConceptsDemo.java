// a) Class and Object
class Animal {
    // Properties of the class
    String name;
    int age;

    // b) Class constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// c) Polymorphism (including d) Method overloading
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    // e) Method overriding
    @Override
    public void displayInfo() {
        System.out.println("Dog Name: " + name + ", Age: " + age);
    }

    // Method overloading
    public void bark() {
        System.out.println(name + " is barking!");
    }

    public void bark(String sound) {
        System.out.println(name + " is barking: " + sound);
    }
}

// f) Inheritance
class Puppy extends Dog {
    public Puppy(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Puppy Name: " + name + ", Age: " + age);
    }
}

// g) Interface
interface Pet {
    void play();
    void beFriendly();
}

// h) Abstract class
abstract class WildAnimal {
    String habitat;

    public WildAnimal(String habitat) {
        this.habitat = habitat;
    }

    // i) Abstraction
    abstract void hunt();

    public void displayHabitat() {
        System.out.println("Habitat: " + habitat);
    }
}

// Concrete class extending an abstract class
class Lion extends WildAnimal {
    public Lion(String habitat) {
        super(habitat);
    }

    @Override
    void hunt() {
        System.out.println("Lion is hunting in the " + habitat);
    }

    @Override
    public void displayHabitat() {
        super.displayHabitat();
    }

    // Adding displayInfo method for consistency with Animal class
    public void displayInfo() {
        System.out.println("Lion in " + habitat);
    }
}

// Implementing interfaces
class Cat extends Animal implements Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing with a ball of yarn!");
    }

    @Override
    public void beFriendly() {
        System.out.println(name + " is being friendly.");
    }
}

// j) Composition and Aggregation
class Zoo {
    private Lion lion; // Composition
    private Animal[] animals; // Aggregation

    public Zoo(Lion lion, Animal[] animals) {
        this.lion = lion;
        this.animals = animals;
    }

    public void showAnimals() {
        lion.displayInfo();
        for (Animal animal : animals) {
            animal.displayInfo();
        }
    }
}

// k) Generalization and Specialization
class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Fish Name: " + name + ", Age: " + age);
    }
}

public class _01_OOPConceptsDemo {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion", 5);
        animal.displayInfo();

        // Inheritance, Method Overriding
        Dog dog = new Dog("Prince", 3);
        dog.displayInfo();
        dog.bark();
        dog.bark("Woof Woof");

        // Polymorphism
        Animal puppy = new Puppy("Prince", 1);
        puppy.displayInfo();

        // Abstract class and Interface
        Lion lion = new Lion("Savannah");
        lion.hunt();
        lion.displayHabitat();

        Cat cat = new Cat("", 2);
        cat.play();
        cat.beFriendly();

        // Composition and Aggregation
        Animal[] animals = {dog, cat};
        Zoo zoo = new Zoo(lion, animals);
        zoo.showAnimals();

        // Generalization and Specialization
        Fish fish = new Fish("Goldie", 1);
        fish.displayInfo();
    }
}
