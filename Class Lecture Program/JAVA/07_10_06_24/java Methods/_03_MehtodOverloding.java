public class _03_MehtodOverloding {

    // Change the different number of parameter
    
    // Method Overloading example
    // First Method 
    private static void display(int a){
        System.out.println("Arguments: "+a);
    }
    // Second Method
    private static void display(int a, int b){
        System.out.println("Arguments : "+a+" and "+b);
    }

    public static void main(String[] args) {
        display(1);  //first method
        display(1, 4); //second method
    }
}
