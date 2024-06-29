public class _12_Splite {
    public static void main(String[] args) {
        String str = "Java is a Programming Language";

        // spilt string from space 
        String[] result = str.split(" "); //spilte will create array of string and character

        System.out.println("Result = ");
        for(String s:result){
            System.out.println(s + ",");
        }
    }
}
