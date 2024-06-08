import java.util.Scanner;

public class _06_Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Marks : ");
        double marks = input.nextDouble();

        // compare the marks
        String result = (marks > 40) ? "Pass" : "Fail";

        System.out.println("You " +result+" The Exam ");

        input.close();
    }
}
