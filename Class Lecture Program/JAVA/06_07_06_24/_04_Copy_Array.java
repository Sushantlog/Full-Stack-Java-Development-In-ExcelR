import java.lang.reflect.Array;
import java.util.Arrays;

public class _04_Copy_Array {
    public static void main(String[] args) {
        // 1)copying using assignment operator
        int[] numbers = {1,2,3,4,5};
        int[] positiveNumber = numbers;

        // Using looping construct
        int[] source = {2,3,5,6,7,8,9};
        int[] destination = new int[8];

        // 2)iterate and copy element from source to destination
        for(int i=0; i<source.length; i++){
            destination[i] = source[i];
        }

        // 3)using arraycopy()
        int[] n1 = {2,3,4,5,6,8,9};
        int[] n3 = new int[5];

        // creating n2 array to know the length of n1

        int[] n2 = new int[n1.length];

        // copying entire n1 into n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));

        // Copying from particular index

        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = "+Arrays.toString(n3));

    }
}
