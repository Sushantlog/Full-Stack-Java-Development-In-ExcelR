
// Single Inheritance

class Vehicle{
    // SuperClass

    public void display(){
        System.out.println("I am a Vehicle");
    }
}

// car inherits vehicle
class Car extends Vehicle{
    //Subclass
    // Override the display() method in parent class  (overridden in super class)
    // @Override this keyword is show the method already present in parent class
    @Override
    public void display(){  //always consider this method crated in subclass
        System.out.println("I am a Car");  
    }

    // new method in subclass
    public void model(){
        System.out.println("I am BMW");
    }
}

public class _02_Overloading {
    public static void main(String[] args) {
        // Create an obj of subclass
        Car obj = new Car();

        // call the display 
        obj.display();
        obj.model();

        // create an obj of superclass
        Vehicle obj1 = new Vehicle();

        obj1.display();


    }
}
