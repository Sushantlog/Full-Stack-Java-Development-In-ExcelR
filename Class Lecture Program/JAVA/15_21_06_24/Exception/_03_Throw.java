public class _03_Throw {
    public static void divideByZero(){
        // Explicitly through a single exception 
        throw new ArithmeticException("Trying to divided by 0.");
    }
    public static void main(String[] args) {
        divideByZero();
    }
}
