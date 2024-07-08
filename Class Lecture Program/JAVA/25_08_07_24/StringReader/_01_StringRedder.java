import java.io.StringReader;

public class _01_StringRedder{
    public static void main(String[] args) {
        String data = "This is from string Reader class";

        char[] array = new char[100];

        try{
            // create stringReader
            StringReader input = new StringReader(data);

            // use read() method
            input.read(array);
            System.out.println("Data read from String : ");
            System.out.println(array);
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
