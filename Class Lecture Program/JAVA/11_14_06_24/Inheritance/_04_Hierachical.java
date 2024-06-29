class A{
    // Base Class
    public void Print_A(){
        System.out.println("Class A");
    }
}

// Derived Classes 
class B extends A{
    public void Print_B(){
        System.out.println("Class B");
    }
}

class C extends A{
    public void Print_C(){
        System.out.println("Class C");
    }
}

class D extends A {
    public void print_D(){
        System.out.println("Class D");
    }
}

public class _04_Hierachical {
    public static void main(String[] args) {
        B obj_B = new B();
        obj_B.Print_A(); //call method of base class
        obj_B.Print_B();

        C obj_C = new C();
        obj_C.Print_A(); //call method of base class
        obj_C.Print_C();

        D obj_D = new D();
        obj_D.Print_A(); //call method of base class
        obj_D.print_D();
    }
}
