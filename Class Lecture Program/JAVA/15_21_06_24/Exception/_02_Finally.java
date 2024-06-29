public class _02_Finally {
    public static void main(String[] args) {
        try {
            int divideByZero = 10/0;
            // int divideByZero = 10/5;
            System.out.println("The try Block");
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Arithmetic Exception : "+e.getMessage());
        }
        // optional

        finally{
            System.out.println("This is finally block.");
        }
    }
}
