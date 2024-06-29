package p2;
import p1._01_Default;

// In default we can not access the other packages but we can use public then it will be accessing 
// in default it will give an error
public class _01_Default1 {
    public static void main(String[] args) {
        _01_Default obj = new _01_Default();  // Create an instance of _01_Default
        obj.display();   // Call the display method
    }
}

// Run this code by using this below step
// PS F:\ExcelR\Class Lecture Program\JAVA\14_19_06_24\Access Modifier> javac _01_Default.java
// PS F:\ExcelR\Class Lecture Program\JAVA\14_19_06_24\Access Modifier> javac -d . _01_Default.java 
// PS F:\ExcelR\Class Lecture Program\JAVA\14_19_06_24\Access Modifier> javac -d . _01_Default1.java
// PS F:\ExcelR\Class Lecture Program\JAVA\14_19_06_24\Access Modifier> java p2._01_Default1
// Hello World 
// PS F:\ExcelR\Class Lecture Program\JAVA\14_19_06_24\Access Modifier> 
