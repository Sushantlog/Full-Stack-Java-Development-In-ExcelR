public class _01_Constructor_Overloading {
    String language;  //this is variable  & this is class member of _01_Constructor_Overloading class

    // first constructor - with no parameter
    _01_Constructor_Overloading(){     //method or constructor of _01_Constructor_Overloading class
        this.language = "Java";
    }

    // Second constructor with single parameter
    _01_Constructor_Overloading(String language){
        this.language = language;
    }

    // write a common method for both
    public void getName(){
        System.out.println("Programming Language : " + this.language);
    }

    public static void main(String[] args){
        // call constructor with no parameter
        _01_Constructor_Overloading obj1 = new _01_Constructor_Overloading();   //access the constructor by creating a object

        // call constructor with parameter
        _01_Constructor_Overloading obj2 = new _01_Constructor_Overloading("C#");

        obj1.getName();  // We create a instance of a class And with that we will use a method  
        obj2.getName();

    }
}
