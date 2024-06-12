public class _01_Example {
    // create a method
    public int addNumber(int a,int b){
        int sum = a + b;
        // return value
        return sum;
    }
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 50;

        // create object for Example class
        _01_Example obj = new _01_Example();

        // calling method 
        int result = obj.addNumber(num1,num2);
        System.out.println("Result is " + result);
    }
}
