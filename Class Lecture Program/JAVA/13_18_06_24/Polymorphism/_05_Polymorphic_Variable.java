// Polymorphic variable
class ProgrammingLanguage{
    public void display(){
        System.out.println("I an a Programming Language. ");
    }
}

class Java extends ProgrammingLanguage{
    @Override
    public void display(){
        System.out.println("I am Java");
    }
}

public class _05_Polymorphic_Variable{
    public static void main(String[] args) {
        // declare an obj variable 
        ProgrammingLanguage p1;

        // Create obj of programming language 
        // ProgrammingLanguage p1 = new ProgrammingLanguage();  //Instead of this, we can use below line 
        p1 = new ProgrammingLanguage();  //accessing value

        p1.display();

        // create obj of java class 
        p1 = new Java();
        p1.display();
    }
}