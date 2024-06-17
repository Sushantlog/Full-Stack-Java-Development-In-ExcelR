public class _04_Change_Parameter_Overloding{
    // overloading  - changing the type of parameter

    // first method with Int type
    private static void display(int a){
        System.out.println("Got an Integer : "+a);    
    }

    // Second method with string type
    private static void display(String a){
        System.out.println("Got a String : "+a);
    }
    public static void main(String[] args) {
        display(5);  //first method
        display("Hello"); //second method
    }

}
