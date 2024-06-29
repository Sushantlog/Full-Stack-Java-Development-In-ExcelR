
// super class
class Employees{
    // SuperClass
    String name;   //Employees name
    int id;        //Employees ID

    Employees(String name,int id){
        this.name = name;
        this.id = id;
    }

    void display(){
        System.out.println("Name : "+ name+ " ID : "+id);
    }
}

// interface for Java Developer
interface JavaDeveloper{
    void writeJavaCode();
}

interface PythonDeveloper{
    void writePythonCode();
}

class FullStackDeveloper extends Employees implements JavaDeveloper, PythonDeveloper{
    // subclass
    FullStackDeveloper(String name,int id){
        super(name, id);  //call the superclass constructor
    }

    public void writeJavaCode(){
        System.out.println(name + " is writing java code");
    }

    public void writePythonCode(){
        System.out.println(name + " is writing python code");
    }
}

public class Company {
    public static void main(String[] args) {
        FullStackDeveloper developer = new FullStackDeveloper("Sushant", 1);

        developer.display();  //superclass

        developer.writeJavaCode(); //interface 1
        developer.writePythonCode(); //interface 2
    }
}
