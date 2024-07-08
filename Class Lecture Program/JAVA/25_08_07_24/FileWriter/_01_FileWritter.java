import java.io.BufferedWriter;
import java.io.FileWriter;

public class _01_FileWritter {
    public static void main(String[] args) {
        String data ="This is the data in the output file";

        try{
            FileWriter file = new FileWriter("output.txt");

            // create buffered writer
            BufferedWriter output = new BufferedWriter(file);

            // Write()
            output.write(data);

            // close
            output.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
