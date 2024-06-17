import java.util.Scanner;
public class _01_Scanner_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer : ");
        int number = input.nextInt();
        System.out.println("You Have Entered : " + number);

        // Getting float input
        System.out.println("Enter Float : ");
        float myFloat = input.nextFloat();
        System.out.println("You Have Entered : " + myFloat);

        System.out.println("Enter Double : ");
        Double myDouble = input.nextDouble();
        System.out.println("You Have Entered : " + myDouble);

        System.out.println("Enter String : ");
        String myStr = input.next();   //next will be accesses text input
        System.out.println("You Have Entered : " + myStr);
        
        // closing input object
        input.close();
    }
}  