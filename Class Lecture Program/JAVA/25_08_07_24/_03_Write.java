import java.io.InputStreamReader;
import java.io.FileInputStream;



public class _03_Write {
    public static void main(String[] args) {
        char[] array = new char[100];
        try{
            // create a fileReader
            FileInputStream file = new FileInputStream("input.txt");

            // crate an inputStreamReader
            InputStreamReader input = new InputStreamReader(file);

            // Read characters
            input.read(array);
            System.out.println("Data is the file.");
            System.out.println(array);

            // close the reader
            input.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}