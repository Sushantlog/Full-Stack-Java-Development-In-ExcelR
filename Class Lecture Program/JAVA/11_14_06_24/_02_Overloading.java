class Vehicle{
    // SuperClass

    public void display(){
        System.out.println("I am a Vehicle");
    }
}



public class _02_Overloading {
    public static void main(String[] args) {
        // Create an obj of subclass
        Car obj = new Car();

        // create an obj of superclass
        Vehicle obj1 = new Vehicle();

        obj1.display();

        // call the display
        obj.display();
        obj.model();
    }
}
