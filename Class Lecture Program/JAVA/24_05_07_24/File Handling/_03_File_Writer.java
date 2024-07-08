import java.io.FileWriter;

public class _03_File_Writer {
    public static void main(String[] args) {
        String data = "This is the data in newfile written using FileWriter class";

        try{
            FileWriter output = new FileWriter("newFile.txt");

            // Writes string to the file
            output.write(data);
            System.out.println("Data is Written to the file : ");

            // closes the writer
            output.close();
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
