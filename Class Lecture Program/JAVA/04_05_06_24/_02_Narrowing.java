public class _02_Narrowing {
    public static void main(String[] args) {
        double myDouble = 5.63d;
        int myInt = (int)myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);

        // Convert float to short
        float myFloat = 45.05f;
        // String myString = "Sushant"; 
        short myShort = (short)myFloat;
        char myChar = (char)myFloat;     //not giving the answer
        // char myChar = (char)myString; //not convert string to charter
        System.out.println(myShort);
        System.out.println(myChar);

        // Calculate Percentage
        int maxScore = 500;
        int userScore = 423;

        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User Score is : "+percentage);

    }
}
