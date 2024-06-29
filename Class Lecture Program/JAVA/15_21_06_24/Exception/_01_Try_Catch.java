public class _01_Try_Catch {
    public static void main(String[] args) {
        try {
            // code that generates exception
            int divideByZero = 5/0;
            System.out.println("The Try Block");

        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Arithmetic Exception = "+e.getMessage());
        }
    }
}
