import java.util.Scanner;
public class _01_if {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number to check negative or not : ");
        int number = input.nextInt();

        if(number < 0){
            System.out.println("The number is negative : " + number);
        }
    }
}
