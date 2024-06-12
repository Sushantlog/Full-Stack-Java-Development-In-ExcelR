import java.util.Arrays;
// import java.io.*;
// import java.util.*;  //import files (Use the Library)

public class _02_Array {
    public static void main(String[] args) {
        int[] myNum = {10,20,30,40,50};
        System.out.println(myNum[1]);

        int[] myint = {10,35,45,55,65};
        System.out.println(myint[3]);
        System.out.println(Arrays.toString(myint));

        // String array
        String[] myFruits = {"Apple","Banana","Mango","Pinapple"};
        System.out.println(myFruits[1]);
        // Arrays.toSting is used to print entire array
        System.out.println(Arrays.toString(myFruits));  

        String[] myString = {"Sushant","Swapnali","Anna"};
        System.out.println(myString[1]);
        System.out.println(Arrays.toString(myString));
    }
}
