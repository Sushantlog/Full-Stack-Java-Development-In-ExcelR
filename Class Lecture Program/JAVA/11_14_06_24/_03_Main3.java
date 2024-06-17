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
    public void Print_Name(){
        System.out.println("I am a child "+ name);
    }
}

public class _03_Main3 {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.name = "John";

        // Calling a method using the above obj
        obj.Print_Name();
    }
}
