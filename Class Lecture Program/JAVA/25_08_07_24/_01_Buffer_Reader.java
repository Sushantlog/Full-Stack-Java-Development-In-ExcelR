import java.io.BufferedReader;
import java.io.FileReader;

public class _01_Buffer_Reader {
    public static void main(String[] args) {
        char[] array = new char[100];
        try{
            // create a fileReader
            FileReader file = new FileReader("input.txt");

            // Create a BufferedReader
            BufferedReader input = new BufferedReader(file);

            // Read characters
            input.read(array);
            System.out.println("Data is input file : ");
            System.out.println(array);

            // close the reader
            input.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}