// Multilevel Inheritance

class Grand_Parent{
    String name;

    // base class
    public void Print_Name(){
        System.out.println("I am Grand_Parent");
    }
}

class Parent extends Grand_Parent{

    // Intermediate class 
    public void Print_Name(){
        System.out.println("I am a Child "+ name);
    }
}

class Child extends Parent{
    // Derived class (child class)
    public void Print_Name(){
        System.out.println("I am a child "+ name);
    }
}

public class _03_Multilevel {
    // Main class
    public static void main(String[] args) {
        // obj of child class
        Child obj = new Child();

        // Assign value  
        obj.name = "John";

        // Calling a method using the above obj
        obj.Print_Name();
    }
}
