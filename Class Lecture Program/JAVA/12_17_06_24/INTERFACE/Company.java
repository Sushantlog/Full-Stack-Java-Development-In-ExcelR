class Employees{
    // StringClass
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

    publi
}

public class Company {
    
}
