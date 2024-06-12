import java.util.Arrays;

public class _02_Array {
    public static void main(String[] args) {
        int[] myNum = {10,20,30,40,50};
        System.out.println(myNum[1]);

        // String array
        String[] myFruits = {"Apple","Banana","Mango","Pinapple"};
        System.out.println(myFruits[1]);
        // Arrays.toSting is used to print entire array
        System.out.println(Arrays.toString(myFruits));  
    }
}
