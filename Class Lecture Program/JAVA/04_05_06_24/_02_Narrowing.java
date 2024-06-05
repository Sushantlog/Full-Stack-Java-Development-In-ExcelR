public class _02_Narrowing {
    public static void main(String[] args) {
        double myDouble = 5.63d;
        int myInt = (int)myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);

        // Calculate Percentage
        int maxScore = 500;
        int userScore = 423;

        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User Score is : "+percentage);

    }
}
