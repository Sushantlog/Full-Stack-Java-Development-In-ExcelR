class Person{
    // Private field
    private int age;

    // getter method
    public int getAge(){
        return age;
    }

    // setter method  (set the value to specific private variable)
    public void setAge(int age){
        this.age = age;
    }
}

public class _02_DataHiding {
    public static void main(String[] args) {
        Person p1 = new Person();

        // System.out.println("Age = "+p1.age);  //age is Restricted field So it cannot access. In normal way So we can use getter and Setter method. 

        // set value to p1
        p1.setAge(22);

        System.out.println("Age = "+p1.getAge());
    }
}
