import java.io.StringWriter;

public class _03_StringWritter {
    public static void main(String[] args) {
        String data = "This is the string text";
        try{
            StringWriter output = new StringWriter();

            // Write the string
            output.write(data);

            System.out.println("Data in the StringWriter: "+output);

            output.close();
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
