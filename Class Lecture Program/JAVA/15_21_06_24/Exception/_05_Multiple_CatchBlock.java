public class _05_Multiple_CatchBlock {
    public static void main(String[] args) {
        try{
            int array[] = new int[10];
            // array[10] = 30/0; //division by zero
            array[11] = 30;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
