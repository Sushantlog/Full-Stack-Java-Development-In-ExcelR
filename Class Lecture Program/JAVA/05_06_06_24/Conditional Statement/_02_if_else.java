import java.util.Scanner;

public class _02_if_else {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = inputScanner.nextInt();

        if(number > 0){
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }
    }
}
