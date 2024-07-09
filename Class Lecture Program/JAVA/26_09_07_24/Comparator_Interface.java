import java.util.ArrayList;

class Student{
    // Attributes of a student
    int rollNo;
    String name, address;

    public Student(int rollNo,String name,String address){
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }
    // To print student details
    public String toString(){
        return this.rollNo + " " +this.name +" "+this.address;
    }
}

// class 2 implement comparator interface - by rollNo
cl

public class Comparator_Interface{
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        // Adding entries in the list

        array.add(new Student(131, "John", "London"));
        array.add(new Student(141, "Chandler", "New York"));
        array.add(new Student(111, "Monica ", "France"));

    }
}