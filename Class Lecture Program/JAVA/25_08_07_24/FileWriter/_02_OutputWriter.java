import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class _02_OutputWriter {
    public static void main(String[] args) {
        String data = "This is line of test inside the file ";

        try{
            FileOutputStream file  =new FileOutputStream("output2.txt");

            // create the outputstreamwriter
            OutputStreamWriter output = new OutputStreamWriter(file);

            // write data in the file
            output.write(data);

            // detEncoding()
            System.out.println("Using GetEncoding(): "+output.getEncoding());

            output.close();
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
