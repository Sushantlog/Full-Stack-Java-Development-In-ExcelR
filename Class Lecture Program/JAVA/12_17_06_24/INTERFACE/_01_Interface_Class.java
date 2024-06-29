interface Language{
    // Abstract Method
    void getName(String name);
}

// class implement interface 
class ProgrammingLanguage implements Language{
    // implementing abstract method
    public void getName(String name){
        System.out.println("Programming Language : "+name);
    }
}

public class _01_Interface_Class {
    public static void main(String[] args) {
        ProgrammingLanguage lane = new ProgrammingLanguage();
        lane.getName("Java");
        lane.getName("C");
    }
}
