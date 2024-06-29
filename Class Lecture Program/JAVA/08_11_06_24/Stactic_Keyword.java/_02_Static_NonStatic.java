public class _02_Static_NonStatic {
    // Static Variable
    static int max = 10;

    // non-static variable
    int min = 1;

    // non-static method
    int multiply(int a,int b){
        return a*b;
    }

    // Static Method
    static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        // create an instance of _02_Static_NonStatic class
        _02_Static_NonStatic obj1 = new _02_Static_NonStatic();

        // invoking non-static method like multiply
        System.out.println("2 * 2 = "+obj1.multiply(2,2));

        // call the static both class and method
        System.out.println("2 + 3 = "+_02_Static_NonStatic.add(2, 3));

        // Accessing non-static variable 
        System.out.println("Min = "+obj1.min);

        // Accessing Static Variable
        System.out.println("Max = "+_02_Static_NonStatic.max);

    }
}
