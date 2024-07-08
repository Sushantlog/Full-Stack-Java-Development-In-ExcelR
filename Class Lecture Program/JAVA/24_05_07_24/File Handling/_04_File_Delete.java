import java.io.File;

public class _04_File_Delete {
    public static void main(String[] args) {
        // create a file object 
        File file = new File("newFile.txt");

        // delete the file
        boolean value = file.delete();
        if(value){
            System.out.println("File has been deleted");
        }else{
            System.out.println("File is not deleted");
        }
    }
}
